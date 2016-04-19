package com.example.ryan.geolbuddy;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IgneousFlowChart extends AppCompatActivity {

    private rockHolder[] igneousRocks= new rockHolder[99];
    ImageView picture;



    private int current, previous,nextYes, nextNo;
    private String currentText;
    Button yesButton, noButton, backButton, restartButton;
    TextView sentence;

    int duration = Toast.LENGTH_SHORT;
    //end toast stuff



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igneous_flow_chart);

        yesButton = (Button)findViewById(R.id.buttonS);
        noButton = (Button)findViewById(R.id.buttonS2);
        sentence = (TextView)findViewById(R.id.textViewS);
        backButton = (Button)findViewById(R.id.backButtonS);
        restartButton = (Button)findViewById(R.id.restartButtonS);
        //based on the flowchart handout.... default for startup.



        picture =  (ImageView)findViewById(R.id.imageViewSed2);
        picture.setImageResource(R.drawable.igneoustitle);

        setupArray();
        yesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                rockHolder nextOption = igneousRocks[nextYes];
                updateEverything(nextOption);

            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (nextNo == -4) //It is a granite, not a granite porphry
                {
                    CharSequence text = "It is just a regular Granite then";
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    return;//dont update anything.
                }
                if(nextNo == -8)
                {
                    CharSequence text = "Double check it, go back if neccessary and try again";
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                    toast.show();
                    return; //dont update anything.
                }
                if(nextNo == -10)//ask user if theyre sure its glassy or not
                {
                    CharSequence text = "Are you sure its glassy? It may be the mineral Quartz if so";
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                    toast.show();
                    return; //dont update anything.
                }
                rockHolder nextOption = igneousRocks[nextNo];
                updateEverything(nextOption);

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if (previous == -1)
                {
                    CharSequence text = "You're at the begining already!";
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    return;
                }
                rockHolder nextOption = igneousRocks[previous];
                updateEverything(nextOption);

            }
        });

        //resets back to the start
        restartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(current == 0)//at the start already...
                {
                    CharSequence text = "You're at the begining already!";
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    return;
                }
                rockHolder nextOption = igneousRocks[0];
                updateEverything(nextOption);

            }
        });



    }

    //this method is going to handle the array
    private void setupArray()
    {
        ImageView temp1 = new ImageView(this);

        //load a new image and store that one in the current rock
        temp1.setImageResource(R.drawable.igneoustitle);
        sentence.setText("Can you see the individual minerals?");
        current = 0;
        previous = 0;
        nextYes = 1;
        nextNo = 9;


        //next:-1 means youre at the end, a -2 means that option is invalid
        igneousRocks[0] = new rockHolder("Can you see the individual minerals?");
        igneousRocks[0].setCurrent(0);
        igneousRocks[0].setNext(1);
        igneousRocks[0].setNextNo(9);
        igneousRocks[0].setPrevious(-1);
        igneousRocks[0].setWhatRock("");


        igneousRocks[1] = new rockHolder("Almost all light colored minerals?");
        igneousRocks[1].setCurrent(1);
        igneousRocks[1].setNext(2);
        igneousRocks[1].setNextNo(3);
        igneousRocks[1].setPrevious(0);
        igneousRocks[1].setWhatRock("");


        igneousRocks[2] = new rockHolder("This rock is Alaskite");
        igneousRocks[2].setCurrent(2);
        igneousRocks[2].setNext(-1);
        igneousRocks[2].setNextNo(-1);
        igneousRocks[2].setPrevious(1);
        igneousRocks[2].setWhatRock("Alaskite");

        igneousRocks[3] = new rockHolder("Mostly light colored minerals?");
        igneousRocks[3].setCurrent(3);
        igneousRocks[3].setNext(4);
        igneousRocks[3].setNextNo(6);
        igneousRocks[3].setPrevious(1);
        igneousRocks[3].setWhatRock("");

        igneousRocks[4] = new rockHolder("This rock is a Granite. Does it have unusually large crystals?");
        igneousRocks[4].setCurrent(4);
        igneousRocks[4].setNext(5);
        igneousRocks[4].setNextNo(-4);//id to verify its granite as a toast.
        igneousRocks[4].setPrevious(3);
        igneousRocks[4].setWhatRock("Granite Porphyry");

        igneousRocks[5] = new rockHolder("This is a Granite Porphyry");
        igneousRocks[5].setCurrent(5);
        igneousRocks[5].setNext(-1);
        igneousRocks[5].setNextNo(-1);
        igneousRocks[5].setPrevious(4);
        igneousRocks[5].setWhatRock("Granite Porphyry");

        igneousRocks[6] = new rockHolder("Is it a mixture of light and dark minerals?");
        igneousRocks[6].setCurrent(6);
        igneousRocks[6].setNext(7);
        igneousRocks[6].setNextNo(8);
        igneousRocks[6].setPrevious(3);
        igneousRocks[6].setWhatRock("");

        igneousRocks[7] = new rockHolder("This rock is a Diorite");
        igneousRocks[7].setCurrent(7);
        igneousRocks[7].setNext(-1);
        igneousRocks[7].setNextNo(-1);
        igneousRocks[7].setPrevious(6);
        igneousRocks[7].setWhatRock("Diorite");

        igneousRocks[8] = new rockHolder("Mostly dark colored minerals?");
        igneousRocks[8].setCurrent(8);
        igneousRocks[8].setNext(19);
        igneousRocks[8].setNextNo(-8);//int id for index 8, when no leads nowhere.
        igneousRocks[8].setPrevious(6);
        igneousRocks[8].setWhatRock("Gabbro");

        //forgot this part, so append it to the end, which is spot 19.
        igneousRocks[19] = new rockHolder("This rock is a Gabbro");
        igneousRocks[19].setCurrent(19);
        igneousRocks[19].setNext(-1);
        igneousRocks[19].setNextNo(-1);
        igneousRocks[19].setPrevious(8);
        igneousRocks[19].setWhatRock("");

        igneousRocks[9] = new rockHolder("Is it Glassy looking?");
        igneousRocks[9].setCurrent(9);
        igneousRocks[9].setNext(10);
        igneousRocks[9].setNextNo(12);
        igneousRocks[9].setPrevious(0);
        igneousRocks[9].setWhatRock("");

        igneousRocks[10] = new rockHolder("Is it dark-colored?");
        igneousRocks[10].setCurrent(10);
        igneousRocks[10].setNext(11);
        igneousRocks[10].setNextNo(-10);//int id for this index to ask user if theyre sure its glassy.
        igneousRocks[10].setPrevious(9);
        igneousRocks[10].setWhatRock("");

        igneousRocks[11] = new rockHolder("This rock is Obsidian");
        igneousRocks[11].setCurrent(11);
        igneousRocks[11].setNext(-1);
        igneousRocks[11].setNextNo(-1);
        igneousRocks[11].setPrevious(10);
        igneousRocks[11].setWhatRock("");

        igneousRocks[12] = new rockHolder("Is it light-colored");
        igneousRocks[12].setCurrent(12);
        igneousRocks[12].setNext(16);
        igneousRocks[12].setNextNo(13);
        igneousRocks[12].setPrevious(9);
        igneousRocks[12].setWhatRock("");

        igneousRocks[13] = new rockHolder("Which does it look more like?");
        igneousRocks[13].setCurrent(13);
        igneousRocks[13].setNext(14);
        igneousRocks[13].setNextNo(15);
        igneousRocks[13].setPrevious(12);
        igneousRocks[13].setWhatRock("");

        igneousRocks[14] = new rockHolder("This rock is Basalt/Diabase");
        igneousRocks[14].setCurrent(14);
        igneousRocks[14].setNext(-1);
        igneousRocks[14].setNextNo(-1);
        igneousRocks[14].setPrevious(13);
        igneousRocks[14].setWhatRock("");

        igneousRocks[15] = new rockHolder("This rock is Andesite");
        igneousRocks[15].setCurrent(15);
        igneousRocks[15].setNext(-1);
        igneousRocks[15].setNextNo(-1);
        igneousRocks[15].setPrevious(13);
        igneousRocks[15].setWhatRock("");

        igneousRocks[16] = new rockHolder("Is it lightweight and porous?");
        igneousRocks[16].setCurrent(16);
        igneousRocks[16].setNext(17);
        igneousRocks[16].setNextNo(18);
        igneousRocks[16].setPrevious(12);
        igneousRocks[16].setWhatRock("");

        igneousRocks[17] = new rockHolder("This rock is Pumice");
        igneousRocks[17].setCurrent(17);
        igneousRocks[17].setNext(-1);
        igneousRocks[17].setNextNo(-1);
        igneousRocks[17].setPrevious(16);
        igneousRocks[17].setWhatRock("");

        igneousRocks[18] = new rockHolder("This rock is Rhyolite/Dacite");
        igneousRocks[18].setCurrent(18);
        igneousRocks[18].setNext(-1);
        igneousRocks[18].setNextNo(-1);
        igneousRocks[18].setPrevious(16);
        igneousRocks[18].setWhatRock("");



    }
    //load the appropriate image depending on step youre in on the flow chart.
    private void adjustImage()
    {
        switch(current)
        {
            case 0:
                //home page one
                picture.setImageResource(R.drawable.igneoustitle);
                break;
            case 1:
                //Almost all light colored minerals?
                picture.setImageResource(R.drawable.lightcolorminerals);
                break;
            case 2:
                //Alaskite
                picture.setImageResource(R.drawable.alaskite);
                break;
            case 3:
                //Mostly light colored minerals?
                picture.setImageResource(R.drawable.mostlylight);
                break;
            case 4:
                //Granite
                picture.setImageResource(R.drawable.granite);
                break;
            case 5:
                //Granite Porphry
                picture.setImageResource(R.drawable.pgranite);
                break;
            case 6 :
                //Mixture of light and dark colored minerals?
                picture.setImageResource(R.drawable.mixlightdark);
                break;
            case 7:
                //Diorite
                picture.setImageResource(R.drawable.diorite);
                break;
            case 8:
                //Mostly dark colored mineals?
                picture.setImageResource(R.drawable.mixlightdark);
                break;
            case 9:
                //Glassy?
                picture.setImageResource(R.drawable.glassy);
                break;
            case 10:
                //Dark Colored?
                picture.setImageResource(R.drawable.darkcolored);
                break;
            case 11:
                //Obsidian
                picture.setImageResource(R.drawable.obsidian);
                break;
            case 12:
                //Light Colored?
                picture.setImageResource(R.drawable.lightcolorminerals);
                break;
            case 13:
                //Black or (gray or brown)?
                picture.setImageResource(R.drawable.blackgreybrown);
                break;
            case 14:
                //Basalt/ Diabase image
                picture.setImageResource(R.drawable.diabase);
                //http://lh3.googleusercontent.com/-YBT977uUdyo/UFA-fktktqI/AAAAAAAAIa4/xZ-x6HuarGY/s720/00108%252520IMG_5396%252520diabase.jpg
                break;
            case 15:
                //Andesite image
                picture.setImageResource(R.drawable.andesite);
                break;
            case 16:
                //lightweight and porous image?
                picture.setImageResource(R.drawable.porosity);
                //http://wgnhs.uwex.edu/wp-content/uploads/2013/04/sandstone-porosity.jpg
                break;
            case 17:
                //Pumice image
                picture.setImageResource(R.drawable.pumice);
                break;
            case 18:
                //Rhyolite/Dacite image
                picture.setImageResource(R.drawable.rhyolite);
                break;
            case 19:
                //gabbro picture.
                picture.setImageResource(R.drawable.gabbro);
                break;
        }

    }
    //update everything and load it in
    private void updateEverything(rockHolder r) {

        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        current = r.getCurrent();
        previous = r.getPrevious();
        nextYes = r.getNext();
        nextNo = r.getNextNo();
        sentence.setText(r.getDescription());
        adjustImage();
        if(current == 13)//a special case, where yes becomes "Black" and no becomes "Grey or brown"
        {
            yesButton.setText("Black");
            noButton.setText("Grey or Brown");
        }
        else//return it to normal for the flow chart
        {
            yesButton.setText("Yes");
            noButton.setText("No");
        }
        if(nextYes == -1)// if its at the end and there is no yes option
        {
            yesButton.setEnabled(false);
            yesButton.setBackgroundColor(Color.GRAY);

        }
        else
        {
            yesButton.setBackgroundColor(Color.parseColor("#003cb3"));
            yesButton.setEnabled(true);
        }
        if(nextNo == -1)// if its at the end and there is no no option
        {
            noButton.setEnabled(false);
            noButton.setBackgroundColor(Color.GRAY);//gray it out nicely
        }
        else
        {
            noButton.setEnabled(true);
            noButton.setBackgroundColor(Color.parseColor("#003cb3"));//add back the original color
        }
    }

}
