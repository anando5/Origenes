package nuevasociedad.origenes;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Busqueda extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busqueda);
	}
	
	public void PasarActividad(View view) {
		  Intent siguiente = new Intent(this, Peenemunde.class);
		  startActivity(siguiente);
		  
		}
	
	public void PasarActividad2(View view) {
		  Intent siguiente = new Intent(this, Bletchley.class);
		  startActivity(siguiente); 
		  
		}
	
	public void PasarActividad3(View view) {
		  Intent siguiente = new Intent(this, Manhattan.class);
		  startActivity(siguiente); 
		  
		}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.busqueda, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}