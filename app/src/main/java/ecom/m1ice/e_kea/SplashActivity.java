package ecom.m1ice.e_kea;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.UnsupportedEncodingException;

import ecom.m1ice.e_kea.models.Alexandre;
import ecom.m1ice.e_kea.models.Etienne;
import ecom.m1ice.e_kea.models.Kais;

public class SplashActivity extends AppCompatActivity {
    public static final String MIME_TEXT_PLAIN = "text/plain";
    private String scannedUser="";
    Context context;
    private NfcAdapter  mNfcAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        context = this;
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);

        scannedUser= readFromIntent(getIntent());
        switch (scannedUser){
            case "Kais" :
                ((GlobalVars) this.getApplication()).setActualUser(new Kais());
                break;
            case "Etienne" :
                ((GlobalVars) this.getApplication()).setActualUser(new Etienne());
                break;
            case "Alexandre" :
                ((GlobalVars) this.getApplication()).setActualUser(new Alexandre());
                break;
                default:
                    ((GlobalVars) this.getApplication()).setActualUser(new Etienne());
        }

        routeToAppropriatePage();
        finish();
    }

    private void routeToAppropriatePage() {

        Intent intent = new Intent(this, ResumeActivity.class);
        startActivity(intent);
    }


    /******************************************************************************
     **********************************Read From NFC Tag***************************
     ******************************************************************************/
    private String readFromIntent(Intent intent) {
        String action = intent.getAction();
        String msg="";
        if (NfcAdapter.ACTION_TAG_DISCOVERED.equals(action)
                || NfcAdapter.ACTION_TECH_DISCOVERED.equals(action)
                || NfcAdapter.ACTION_NDEF_DISCOVERED.equals(action)) {
            Parcelable[] rawMsgs = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);
            NdefMessage[] msgs = null;
            if (rawMsgs != null) {
                msgs = new NdefMessage[rawMsgs.length];
                for (int i = 0; i < rawMsgs.length; i++) {
                    msgs[i] = (NdefMessage) rawMsgs[i];
                }
            }
          msg=  buildTagViews(msgs);
        }
        return msg;
    }
    private String buildTagViews(NdefMessage[] msgs) {
        if (msgs == null || msgs.length == 0) return "";

        String text = "";
//        String tagId = new String(msgs[0].getRecords()[0].getType());
        byte[] payload = msgs[0].getRecords()[0].getPayload();
        String textEncoding = ((payload[0] & 128) == 0) ? "UTF-8" : "UTF-16"; // Get the Text Encoding
        int languageCodeLength = payload[0] & 0063; // Get the Language Code, e.g. "en"
        // String languageCode = new String(payload, 1, languageCodeLength, "US-ASCII");

        try {
            // Get the Text
            text = new String(payload, languageCodeLength + 1, payload.length - languageCodeLength - 1, textEncoding);
        } catch (UnsupportedEncodingException e) {
            Log.e("UnsupportedEncoding", e.toString());
        }
    return text;
        //tvNFCContent.setText("Bonjour " + text);
    }

    /**
     * @param activity The corresponding {@link Activity} requesting the foreground dispatch.
     * @param adapter The {@link NfcAdapter} used for the foreground dispatch.
     */
    public static void setupForegroundDispatch(final Activity activity, NfcAdapter adapter) {
        final Intent intent = new Intent(activity.getApplicationContext(), activity.getClass());
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        final PendingIntent pendingIntent = PendingIntent.getActivity(activity.getApplicationContext(), 0, intent, 0);

        IntentFilter[] filters = new IntentFilter[1];
        String[][] techList = new String[][]{};

        // Notice that this is the same filter as in our manifest.
        filters[0] = new IntentFilter();
        filters[0].addAction(NfcAdapter.ACTION_NDEF_DISCOVERED);
        filters[0].addCategory(Intent.CATEGORY_DEFAULT);
        try {
            filters[0].addDataType(MIME_TEXT_PLAIN);
        } catch (IntentFilter.MalformedMimeTypeException e) {
            throw new RuntimeException("Check your mime type.");
        }

        adapter.enableForegroundDispatch(activity, pendingIntent, filters, techList);
    }

    @Override
    protected void onResume() {
        super.onResume();

        /**
         * It's important, that the activity is in the foreground (resumed). Otherwise
         * an IllegalStateException is thrown.
         */
        setupForegroundDispatch(this, mNfcAdapter);

    }


    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        readFromIntent(intent);

    }
}
