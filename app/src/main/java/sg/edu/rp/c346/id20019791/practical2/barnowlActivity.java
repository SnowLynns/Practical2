package sg.edu.rp.c346.id20019791.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class barnowlActivity extends AppCompatActivity {
    Button barnOwl;
    TextView barnowldescription;

    String viewSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barnowl);
        barnOwl = findViewById(R.id.btnBarnOwl);
        barnowldescription = findViewById(R.id.barnowlDesc);

        registerForContextMenu(barnowldescription);


        barnOwl.setOnClickListener(new View.OnClickListener()

        {
            boolean clicked = false;
            @Override
            public void onClick (View v){
                clicked = true;
                if (clicked = true) {
                    Intent bodesc = new Intent(Intent.ACTION_VIEW, Uri.parse("https://a-z-animals.com/animals/barn-owl/#single-animal-text"));
                    startActivity(bodesc);
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.v("Context", "create context");
        menu.add(0, 0, 0, "size 10");
        menu.add(0, 1, 1, "size 20");
        menu.add(0, 2, 2, "size 30");

        if (v == barnowldescription) {
            viewSelected = "toptextview";
            Log.v("Context", "Barn Owl description selected");
        }
    }

    //checking what happens when a button is tapped
    @Override

    public boolean onContextItemSelected(MenuItem item) {

        if (viewSelected.equalsIgnoreCase("toptextview")) {
            if (item.getItemId() == 0) {
                barnowldescription.setTextSize(10);
                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) {
                barnowldescription.setTextSize(20);
            } else if (item.getItemId() == 2) {
                barnowldescription.setTextSize(30);
            }
            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
}


