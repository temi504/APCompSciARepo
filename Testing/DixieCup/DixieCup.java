public class DixieCup{
    private String items[];
    private int itemNumber = 0;
    public DixieCup(int i){
        items = new String[i];
        for( int j =0; j < i; j++){
            items[j]= "empty";
        }
    }
    public void addItem(String n){
        //challenge 1
        if(itemNumber < items.length){
            items[itemNumber] = n;
            itemNumber++;
        }else{
            System.out.println("More items than expected!");
        }
    }
    public void getItem(int i){
        if(i > items.length)
           System.out.println("This position is not in your cupArray!");
       System.out.println(items[i]); 
    }
    
    public String getsItem(int i){
        
        return items[i]; 
    }
    
    public void removeItem(String n){
        int count = 0;
        for(int x = 0; x < items.length; x ++){
            if(items[x].equals(n)){
                items[x] = "empty";
                itemNumber--;//challenge 1
            }
        }
       if(count < 1){
            System.out.println("Error: Item " + n + " is not found.");
        }
    }
    //challenge 1
    public void replaceItem(String n,String f){
       int count = 0;
        for(int x = 0; x < items.length;x++){
            if(items[x].equals(n)){
                items[x] = f;
                count +=1;
            }

        }
        if(count < 1){
            System.out.println("Error: Item " + n + " is not found.");
        }
    }
    //challenge 2
    public void listItems(){
        for(int i = 0; i < items.length; i++){
            System.out.println((i+1 )+ ". " + items[i]);
        }
    }
    

    //chlallenge 3
    public void setItem(int p, String n){
        if(p < items.length){
            if(items[p] == "empty"){
            items[p] = n;
            itemNumber++;
            }else{
                items[p] = n;
            }
        }else{
            System.out.println("The number is way greater than what your cupArray can hold!");
        }
    }
    //challenge 5
    public void numItems(){
       
            System.out.println(itemNumber);
        
    }
    public int numberItems(){
       
        return itemNumber;
    
}

public String toString(){
    String contents = "";

    for(int i = 0; i < items.length; i++){
        contents += items[i] + ",";

    }
    return contents;
}

}