package ecom.m1ice.e_kea.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import ecom.m1ice.e_kea.BuildConfig;

public class OpenFileUtils {

    public static void openResume(String resumeName, Activity caller) {
        // create new Intent
        Intent intent = new Intent(Intent.ACTION_VIEW);

        // set flag to give temporary permission to external app to use your FileProvider
        intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        // generate URI, I defined authority as the application ID in the Manifest, the last param is file I want to open
        File copiedFile = copyFromAssets(resumeName, caller);
        Uri uri = FileProvider.getUriForFile(caller, BuildConfig.APPLICATION_ID + ".fileprovider", copiedFile);

        // I am opening a PDF file so I give it a valid MIME type
        intent.setDataAndType(uri, "application/pdf");

        // validate that the device can open your File!
        PackageManager pm = caller.getPackageManager();
        if (intent.resolveActivity(pm) != null) {
            caller.startActivity(intent);
        }
    }

    private static File copyFromAssets(String resumeName, Activity caller) {
        AssetManager assetManager = caller.getAssets();

        InputStream in = null;
        OutputStream out = null;
        try {
            in = assetManager.open(resumeName);
            File outFile = new File(caller.getExternalFilesDir(null), resumeName);
            out = new FileOutputStream(outFile);
            copyFile(in, out);
            return outFile;
        } catch (IOException e) {
            Log.e("tag", "Failed to copy asset file: " + resumeName, e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // NOOP
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // NOOP
                }
            }
        }

        return null;
    }

    private static void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }
}
