import Nuts.*;
import bhaji.Flower;
import bhaji.Shepu;
import breakfast.Pohe;
import breakfast.Upma;
import fruits.*;
import rotis.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    static float protein=0;
    static float calories=0;
    static float carbs=0;
    static float fats=0;

    //----------------------------------vvv NUT INITIALIZATION vvv----------------------------------------
    String[] nutstring={"--Select--","Kaju","Almonds","Akhrod"};
    JComboBox nutbox =new JComboBox(nutstring);
    JTextField nutfield;
    JButton addnut;
    JButton clrnut;

    //------------------------vvv FRUITS INITIALIZATION vvv------------------------------------------------
    String[] fruitstring={"--Select--","Banana","Apple"};
    JComboBox fruitbox=new JComboBox(fruitstring);
    JTextField fruitfield=new JTextField();
    JLabel fruitlabel=new JLabel();
    JButton addfruit;
    JButton clrfruit;

    //-----------------------vvv ROTI INITIALIZATION vvv--------------------------------------------------
    String[] rotistring={"--Select--","Chapati","Alo Paratha","Methi Paratha","Mula Paratha"};
    JComboBox rotibox =new JComboBox(rotistring);
    JTextField rotifield;
    JButton addroti;
    JButton clrroti;
    
    //-----------------------vvv BHAJI INITIALIZATION vvv---------------------------------------------------
    String[] bhajistring={"--Select--","Shepu","Flower","Batata","Kobi","Bhendi","Palak Paneer","Methi","Shimla Mirch","Kanda chi Paath","Wangi","Tondli","Mula"};
    JComboBox bhajibox =new JComboBox(bhajistring);
    JTextField bhajifield;
    JButton addbhaji;
    JButton clrbhaji;
    
    //--------------------------vvv RICE INITIALIZATION vvv-----------------------------------------------
    String[] ricestring={"--Select--","Rice"};
    JComboBox ricebox =new JComboBox(ricestring);
    JTextField ricefield;
    JButton addrice;
    JButton clrrice;
    
    //-------------------------------vvv CURRY INITIALIZATION vvv------------------------------------------
    String[] currystring={"--Select--","Varan","Ampti"};
    JComboBox currybox =new JComboBox(currystring);
    JTextField curryfield;
    JButton addcurry;
    JButton clrcurry;
    
    //-------------------------------vvv BREAKFAST INITIALIZATION vvv-----------------------------------------
    String[] bfstring={"--Select--","Upma","Pohe","Sabudana Khichdi","Milk"};
    JComboBox bfbox =new JComboBox(bfstring);
    JTextField bffield;
    JButton addbf;
    JButton clrbf;
    
    //----------------------------------vvv JUNK INITIALIZATION vvv---------------------------------------
    String[] junkstring={"--Select--","Pizza","Burger","Wada Pav"};
    JComboBox junkbox =new JComboBox(junkstring);
    JTextField junkfield;
    JButton addjunk;
    JButton clrjunk;
    
    JButton go;
    
    Gui(){

        //-----------------------------------vvv FRUITS SECTION vvv-------------------------------------------
        fruitlabel.setText("Fruits");
        fruitlabel.setBounds(50,100,50,50);
        fruitbox.setBounds(50,150,100,25);
        fruitfield.setBounds(175,150,100,25);
        fruitbox.addActionListener(this);
        addfruit=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addfruit.setBounds(300,150,50,25);
        addfruit.addActionListener(this::actionPerformed);
        addfruit.setFocusable(false);
        clrfruit=new JButton("Clear");
        clrfruit.setBounds(351,150,70,25);
        clrfruit.addActionListener(this::actionPerformed);
        clrfruit.setFocusable(false);


        //------------------------------vvv GO BUTTON SECTION vvv---------------------------------------------
        go=new JButton("Go");
        go.setBounds(450,470,100,51);
        go.setFocusable(false);
        go.addActionListener(this::actionPerformed);

        //------------------------------vvv NUT SECTION vvv---------------------------------------------------
        JLabel nut=new JLabel();
        nut.setText("Nuts");
        nut.setBounds(50,0,50,50);
        nutbox.setBounds(50,50,100,25);
        nutfield=new JTextField();
        nutfield.setBounds(175,50,100,25);
        addnut=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addnut.setBounds(300,50,50,25);
        addnut.addActionListener(this::actionPerformed);
        addnut.setFocusable(false);
        clrnut=new JButton("Clear");
        clrnut.setBounds(351,50,70,25);
        clrnut.addActionListener(this::actionPerformed);
        clrnut.setFocusable(false);
        
        //----------------------------vvv ROTI SECTION vvv------------------------------------------------------
        JLabel roti=new JLabel();
        roti.setText("Rotis");
        rotifield=new JTextField();
        roti.setBounds(50,200,50,50);
        rotibox.setBounds(50,250,100,25);
        rotifield.setBounds(175,250,100,25);
        addroti=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addroti.setBounds(300,250,50,25);
        addroti.addActionListener(this::actionPerformed);
        addroti.setFocusable(false);
        clrroti=new JButton("Clear");
        clrroti.setBounds(351,250,70,25);
        clrroti.addActionListener(this::actionPerformed);
        clrroti.setFocusable(false);
        
        //-------------------------------vvv BHAJI SECTION vvv-----------------------------------------------
        JLabel bhaji=new JLabel();
        bhaji.setText("Bhajis");
        bhajifield=new JTextField();
        bhaji.setBounds(500,0,50,50);
        bhajibox.setBounds(500,50,115,25);
        bhajifield.setBounds(625,50,100,25);
        addbhaji=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addbhaji.setBounds(750,50,50,25);
        addbhaji.addActionListener(this::actionPerformed);
        addbhaji.setFocusable(false);
        clrbhaji=new JButton("Clear");
        clrbhaji.setBounds(801,50,70,25);
        clrbhaji.addActionListener(this::actionPerformed);
        clrbhaji.setFocusable(false);
        
        //--------------------------------vvv RICE SECTION vvv-----------------------------------------------------
        JLabel rice=new JLabel();
        rice.setText("Rice");
        ricefield=new JTextField();
        rice.setBounds(500,100,50,50);
        ricebox.setBounds(500,150,100,25);
        ricefield.setBounds(625,150,100,25);
        addrice=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addrice.setBounds(750,150,50,25);
        addrice.addActionListener(this::actionPerformed);
        addrice.setFocusable(false);
        clrrice=new JButton("Clear");
        clrrice.setBounds(801,150,70,25);
        clrrice.addActionListener(this::actionPerformed);
        clrrice.setFocusable(false);

        //-------------------------------------vvv CURRY SECTION vvv-----------------------------------------------
        JLabel curry=new JLabel();
        curry.setText("Curry");
        curryfield=new JTextField();
        curry.setBounds(500,200,50,50);
        currybox.setBounds(500,250,100,25);
        curryfield.setBounds(625,250,100,25);
        addcurry=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addcurry.setBounds(750,250,50,25);
        addcurry.addActionListener(this::actionPerformed);
        addcurry.setFocusable(false);
        clrcurry=new JButton("Clear");
        clrcurry.setBounds(801,250,70,25);
        clrcurry.addActionListener(this::actionPerformed);
        clrcurry.setFocusable(false);
        
        //---------------------------------------vvv BREAKFAST SECTION vvv-------------------------------------------
        JLabel bf=new JLabel();
        bf.setText("Breakfast");
        bffield=new JTextField();
        bf.setBounds(50,300,200,50);
        bfbox.setBounds(50,350,110,25);
        bffield.setBounds(175,350,100,25);
        addbf=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addbf.setBounds(300,350,50,25);
        addbf.addActionListener(this::actionPerformed);
        addbf.setFocusable(false);
        clrbf=new JButton("Clear");
        clrbf.setBounds(351,350,70,25);
        clrbf.addActionListener(this::actionPerformed);
        clrbf.setFocusable(false);

        //---------------------------------------vvv JUNK SECTION vvv-------------------------------------------
        JLabel junk=new JLabel();
        junk.setText("Junk");
        junkfield=new JTextField();
        junk.setBounds(500,300,200,50);
        junkbox.setBounds(500,350,100,25);
        junkfield.setBounds(625,350,100,25);
        addjunk=new JButton("+");//----------------vvv Add and Clear Button section vvv---------------------------
        addjunk.setBounds(750,350,50,25);
        addjunk.addActionListener(this::actionPerformed);
        addjunk.setFocusable(false);
        clrjunk=new JButton("Clear");
        clrjunk.setBounds(801,350,70,25);
        clrjunk.addActionListener(this::actionPerformed);
        clrjunk.setFocusable(false);
        
        //--------------------------vvv FRAME SECTION vvv---------------------------------------------------
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CALORIE COUNTER");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(1000,600);
        frame.setResizable(false);

        //----------------------------vvv ALL COMPONENTS ARE ADDED HERE vvv-----------------------------------
        frame.add(nut);
        frame.add(fruitbox);
        frame.add(fruitfield);
        frame.add(fruitlabel);
        frame.add(nutbox);
        frame.add(nutfield);
        frame.add(go);
        frame.add(addnut);
        frame.add(clrnut);
        frame.add(roti);
        frame.add(rotibox);
        frame.add(rotifield);
        frame.add(addroti);
        frame.add(clrroti);
        frame.add(addfruit);
        frame.add(clrfruit);
        frame.add(bhaji);
        frame.add(bhajibox);
        frame.add(bhajifield);
        frame.add(addbhaji);
        frame.add(clrbhaji);
        frame.add(rice);
        frame.add(ricebox);
        frame.add(ricefield);
        frame.add(addrice);
        frame.add(clrrice);
        frame.add(curry);
        frame.add(currybox);
        frame.add(curryfield);
        frame.add(addcurry);
        frame.add(clrcurry);
        frame.add(bf);
        frame.add(bfbox);
        frame.add(bffield);
        frame.add(addbf);
        frame.add(clrbf);
        frame.add(junk);
        frame.add(junkbox);
        frame.add(junkfield);
        frame.add(addjunk);
        frame.add(clrjunk);

    }
    public void actionPerformed(ActionEvent e){
        String nuttype;
        nuttype= nutbox.getSelectedItem().toString();
        double[] inputnutarray=new double[3];
//---------------------vvv NUT SECTION vvv------------------------------
        if(e.getSource()==addnut){
            if(nuttype.equals("Almonds")){
                String value=nutfield.getText();
                double dataingms=Double.parseDouble(value);
                inputnutarray[0]=dataingms;
                Almonds a=new Almonds(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(nuttype.equals("Kaju")){
                String value=nutfield.getText();
                double dataingms=Double.parseDouble(value);
                inputnutarray[1]=dataingms;
                Kaju a=new Kaju(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(nuttype.equals("Akhrod")){
                String value=nutfield.getText();
                double dataingms=Double.parseDouble(value);
                inputnutarray[2]=dataingms;
                Akhrod a=new Akhrod(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
            }
            nutfield.setText("");
        }
        if (e.getSource()==clrnut){
            protein=0;
            calories=0;
            carbs=0;
            fats=0;
            nutfield.setText("");
            System.out.println(protein);
            System.out.println(calories);
        }

        //-----------------------vvv FRUIT SECTION vvv------------------------------------
        String fruittype;
        fruittype= fruitbox.getSelectedItem().toString();
        double[] inputfruitarray=new double[2];
        int banana=0;
        int apple=1;
        if(e.getSource()==addfruit){
            if(fruittype.equals("Banana")){
                String value=fruitfield.getText();
                double dataingms=Double.parseDouble(value);
                inputfruitarray[banana]=dataingms;
                Banana a=new Banana(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(fruittype.equals("Apple")){
                String value=fruitfield.getText();
                double dataingms=Double.parseDouble(value);
                inputfruitarray[apple]=dataingms;
                Apple a=new Apple(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }

            fruitfield.setText("");
        }
        if (e.getSource().equals(clrfruit)) {
            protein = 0;
            calories = 0;
            carbs=0;
            fats=0;
            fruitfield.setText("");
        }

        //--------------------------------vvv ROTI SECTION vvv---------------------------------------
        String rotitype;
        rotitype= rotibox.getSelectedItem().toString();
        double[] inputrotiarray=new double[4];
        int chapati=0;
        int aloparatha=1;
        int methiparatha=2;
        int mulaparatha =3;
        if(e.getSource()==addroti){
            if(rotitype.equals("Chapati")){
                String value=rotifield.getText();
                double dataingms=Double.parseDouble(value);
                inputrotiarray[chapati]=dataingms;
                Chapati a=new Chapati(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(rotitype.equals("Alo Paratha")){
                String value=rotifield.getText();
                double dataingms=Double.parseDouble(value);
                inputrotiarray[aloparatha]=dataingms;
                AloParatha a=new AloParatha(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(rotitype.equals("Methi Paratha")){
                String value=rotifield.getText();
                double dataingms=Double.parseDouble(value);
                inputrotiarray[methiparatha]=dataingms;
                MethiParatha a=new MethiParatha(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(rotitype.equals("Mula Paratha")){
                String value=rotifield.getText();
                double dataingms=Double.parseDouble(value);
                inputrotiarray[mulaparatha]=dataingms;
                MulaParatha a=new MulaParatha(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }

            rotifield.setText("");
        }
        if (e.getSource().equals(clrroti)) {
            protein = 0;
            calories = 0;
            carbs=0;
            fats=0;
            rotifield.setText("");
        }

        ///----------------------------vvv BREAKFAST SECTION vvv-------------------------------------
        String bftype;
        bftype= bfbox.getSelectedItem().toString();
        double[] inputbfarray=new double[2];
        int upma=0;
        int pohe=1;
        if(e.getSource()==addbf){
            if(bftype.equals("Upma")){
                String value=bffield.getText();
                double dataingms=Double.parseDouble(value);
                inputbfarray[upma]=dataingms;
                Upma a=new Upma(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(bftype.equals("Pohe")){
                String value=bffield.getText();
                double dataingms=Double.parseDouble(value);
                inputbfarray[pohe]=dataingms;
                Pohe a=new Pohe(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }

            bffield.setText("");
        }
        if (e.getSource().equals(clrbf)) {
            protein = 0;
            calories = 0;
            carbs=0;
            fats=0;
            bffield.setText("");
        }

        //----------------------------------vvv BHAJI SECTION vvv-------------------------------------
        String bhajitype;
        bhajitype= bhajibox.getSelectedItem().toString();
        double[] inputbhajiarray=new double[2];
        int shepu=0;
        int flower=1;
        if(e.getSource()==addbhaji){
            if(bhajitype.equals("Shepu")){
                String value=bhajifield.getText();
                double dataingms=Double.parseDouble(value);
                inputbhajiarray[shepu]=dataingms;
                Shepu a=new Shepu(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }
            if(bhajitype.equals("Flower")){
                String value=bhajifield.getText();
                double dataingms=Double.parseDouble(value);
                inputbhajiarray[flower]=dataingms;
                Flower a=new Flower(dataingms);
                protein+=a.prot;
                calories+=a.cal;
                carbs+=a.carbs;
                fats+=a.fats;
                System.out.println(protein);
                System.out.println(calories);
            }

            bhajifield.setText("");
        }
        if (e.getSource().equals(clrbhaji)) {
            protein = 0;
            calories = 0;
            carbs=0;
            fats=0;
            bhajifield.setText("");
        }
        if (e.getSource().equals(go)){

            ResultsWindow r=new ResultsWindow(protein,calories,carbs,fats);
        }

    }
}
