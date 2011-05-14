package rru.taveesak.smstest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class smsReciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle = intent.getExtras();
		SmsMessage[] msgs=null;
		if(bundle !=null){
			Object[] pdus=(Object[])bundle.get("pdus");
			msgs=new SmsMessage[pdus.length];
			if (msgs.length >= 0) {
				msgs[0] = SmsMessage.createFromPdu((byte[]) pdus[0]);
			    String message = msgs[0].getMessageBody().toString();
			    Toast.makeText(context,message,Toast.LENGTH_LONG).show();
			   }
		}
		
	}
	
}
