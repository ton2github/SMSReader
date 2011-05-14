package rru.taveesak.smstest;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;;


public class smstest extends Activity {
	Button btSend;
	EditText etNumber,etText;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btSend=(Button)findViewById(R.id.Button01);
        etNumber=(EditText)findViewById(R.id.EditText01);
        etText=(EditText)findViewById(R.id.EditText02);
        
        //button
        btSend.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				sendSMS(etNumber.toString(),String.valueOf(etText));
				
			}
		});
    }
    
   
	private void sendSMS(final String phoneNumber,final String message){
    	SmsManager sms = SmsManager.getDefault();
    	sms.sendTextMessage(phoneNumber, null, message, null, null);
    	
    }
    
    
}