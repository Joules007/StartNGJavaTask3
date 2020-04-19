package ng.com.ajsprojects.startngjavatask3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public MainActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<GroceryDeal> groceryList = new ArrayList<>();
        groceryList.add(new GroceryDeal("Rice", "A bag of rice ", "\u20a6 25000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Garri", "A bag of garri", "\u20a6 13000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Beans", "A bag of beans", "\u20a6 15000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Tomatoes", "A basket of tomatoes", "\u20a6 5000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Onions", "A basket of onions", "\u20a6 2000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Oranges", "A basket of oranges", "\u20a6 2000", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Mangoes", "A basket of mangoes", "\u20a6 2200", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Yam Flour", "A bowl of yam flour", "\u20a6 200", R.drawable.ic_android ));
        groceryList.add(new GroceryDeal("Yam Tubers", "5 Tubers of yam", "\u20a6 2000", R.drawable.ic_android ));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new GroceryAdapter(groceryList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });





    }


}
