package helloPlugin.example;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class HelloPluginService extends Service implements Runnable {

	private String  message;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

    	message = intent.getStringExtra("message");

        new Thread(this).start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void run() {
        this.startRequest();
    }

    private void startRequest(){
        while(true) {
        	//Thread.sleep(1000);
        	Log.i("HelloPlugin", this.message);
        }
    }
}