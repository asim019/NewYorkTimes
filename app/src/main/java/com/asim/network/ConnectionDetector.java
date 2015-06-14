package com.asim.network;

import android.content.Context;
import android.net.ConnectivityManager;

public class ConnectionDetector {
	
	@SuppressWarnings("unused")
	private Context context;
	
	public ConnectionDetector(Context context){
		this.context = context;
	}
	
	public static boolean checkInternetConnection(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		// test for connection
		if (cm.getActiveNetworkInfo() != null
		&& cm.getActiveNetworkInfo().isAvailable()
		&& cm.getActiveNetworkInfo().isConnected()) {
		return true;
		} else {
		return false;
		}
		}


}
