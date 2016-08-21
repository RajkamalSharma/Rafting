package rafting.adventure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button type1Rafting, type2Rafting;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnType1RaftingButton();
		addListenerOnType2RaftingButton();

	}

	private void addListenerOnType1RaftingButton() {

		type1Rafting = (Button) findViewById(R.id.type1rafting);

		type1Rafting.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, RaftingDate.class);

				startActivity(intent);
			}
		});

	}

	private void addListenerOnType2RaftingButton() {

		type2Rafting = (Button) findViewById(R.id.type2rafting);

		type2Rafting.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, RaftingDate.class);

				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
