import java.util.ArrayList;

public class LinearProbing {
    String HashTable[];
    int UsedCells;

    LinearProbing(int size){
        HashTable = new String[size];
        UsedCells = 0;
    }

    public int modAsciiValue(String word,int m){
        char ch[];
        ch = word.toCharArray();
        int i ,sum = 0;
        for( i = 0;i<word.length();i++){
            sum = sum + ch[i];
        }
        return sum % m;
    }

    public double getLoadfactor(){
        return UsedCells * 1.0 / HashTable.length;
    }

    public void rehashKeys(String word) {
        UsedCells = 0;
        ArrayList<String> data = new ArrayList<>();
        for (String s : HashTable) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(word);
        HashTable = new String[HashTable.length * 2];

        for (String t : data) {
            if (t != null) {
                insert(t);
            }
        }
    }



        public void insert(String word){
Double Load = getLoadfactor();
if(Load >= 0.75){
    rehashKeys(word);
}else{
    int Index = modAsciiValue(word,HashTable.length);
    for(int i = Index ;i<Index + HashTable.length;i++){
        int newIndex = i % HashTable.length;
        if(HashTable[newIndex] == null){
            HashTable[newIndex] = word;
break;
        }else{
System.out.println("Free space not found trying again");
        }
    }

    UsedCells++;
        }

    }

    public void newinsert(String word){
        if(UsedCells >= HashTable.length){
            rehashKeys(word);
        }else{
            int newIndex = modAsciiValue(word,HashTable.length
            );
            if(HashTable[newIndex] != null){
                for(int i = newIndex;i<newIndex + HashTable.length;i++){
                    if(HashTable[i] == null ){
                        HashTable[i] = word;
                    }else {
                        i++;
                    }
                }
            }
            HashTable[newIndex] = word;

        }
    }

    public void display(){
        if(HashTable == null){
            System.out.println("hastable is not present");
        }else{
            for(int i = 0;i<HashTable.length;i++){
                System.out.println("Index " + i + " Value : " + HashTable[i]);
            }
        }
    }

    public void Search(String word){
        int index = modAsciiValue(word,HashTable.length);
        for(int i = index;i<HashTable.length;i++){
                int newIndex = i++;
                if(HashTable[newIndex] != null && HashTable[newIndex] == word){
                    System.out.println("value Present in the HashTable");
                    return;
                }
            }
            System.out.println("Value Not Found");
        }




    public static void main(String[] args){
        LinearProbing lp = new LinearProbing(5);
        lp.insert("Sr");
        lp.insert("ri");
        lp.insert("ir");
        lp.insert("ra");
        lp.insert("am");
        lp.insert("am");

        lp.display();
        lp.Search("am");
    }






}


