public class DixieCupMaker{
    public static void main(String[] args){
        DixieCup[] cupsArray = new DixieCup[5];
        
        
        cupsArray[0] =  new DixieCup(4);
        cupsArray[1] =  new DixieCup(8);
        cupsArray[2] =  new DixieCup(6);
        cupsArray[3] =  new DixieCup(6);
        cupsArray[4] =  new DixieCup(9);

        cupsArray[0].addItem("A");
        cupsArray[0].addItem("B");
        cupsArray[0].addItem("C");
        cupsArray[0].addItem("D");
       
        System.out.println(cupsArray[0].toString());
        cupsArray[4].addItem("Microwave1");
        cupsArray[4].addItem("Microwave2");
        cupsArray[4].addItem("Microwave3");
        swap(cupsArray[0], cupsArray[4], 1, 0);
        System.out.println(cupsArray[0].toString());

        //cupsArray[2].addItem("Microwave");

        //cupsArray[0].addItem("Microwave");
        //cupsArray[0].addItem("Microwave");



        //cupsArray[3].addItem("Microwave");
        //cupsArray[3].addItem("Microwave");
        //cupsArray[3].addItem("Microwave");
        //cupsArray[3].addItem("Microwave");

       /*
        cupsArray[0].addItem("Microwave");
        cupsArray[0].addItem("Tea");
        cupsArray[0].addItem("Coffee");
        cupsArray[0].listItems();
        
        cupsArray[0].replaceItem("Microwaqave", "Coffee Maker");
        cupsArray[0].addItem("Microwaqave");
        
        cupsArray[0].replaceItem("Microwaqave", "Coffee Maker");
        cupsArray[0].listItems();
        */
       
       
        //cupsArray[0].getItem(9);
        /*
        cupsArray[0].addItem("Fridge");
        cupsArray[0].addItem("Stop");
        cupsArray[0].addItem("Cup");
         cupsArray[0].listItems();
         cupsArray[0].replaceItem("Microwave", "Coffee Maker");
         cupsArray[0].listItems();
         cupsArray[0].removeItem("Fridge");
         cupsArray[0].listItems();
         */
         //String hello= highlow(cupsArray);
         //System.out.println(hello);
    }
    public static void swap(DixieCup d1,DixieCup d2,int i1, int i2){
        String temp = d1.getsItem(i1);
        d1.setItem(i1,d2.getsItem(i2));
        d2.setItem(i2,temp);
    }
    public static String highlow(DixieCup[] a){
        int h = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        System.out.println(a.length);
        for(int x = 0;x < a.length; x++){
            if((x + 1) < a.length){
            if(a[h].numberItems() < a[x+1].numberItems()){
                h = x+1 ;
                
            }
        }
    }
    k = a[h].numberItems();
    for(int x = 0;x < a.length; x++){
        if((x + 1) < a.length){
        if(a[l].numberItems() > a[x+1].numberItems()){
            l = x+1 ;
            
        }
    }
}
        m= a[l].numberItems();
       
        return ("Dixie Cup: " + h + " Highest number is " + k+ "\nDixie Cup: " + l +" Lowest number is " + m);
    }
}