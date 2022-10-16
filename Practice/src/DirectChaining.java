import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {

    LinkedList <String>[] hashtable;
    DirectChaining(int size){
        hashtable = new LinkedList[size];
    }

    public int modAsciiValue(String word,int m){
        char ch[];
        ch = word.toCharArray();
        int i ,sum = 0;
        for( i = 0;i<hashtable.length;i++){
            sum = sum + ch[i];
        }
        return sum % m;
    }

    public void insert(String word){
        int newIndex = modAsciiValue(word,hashtable.length);
        if(hashtable[newIndex] == null){
            hashtable[newIndex] = new LinkedList<>();
            hashtable[newIndex].add(word);

        }else{
            hashtable[newIndex].add(word);
        }
    }

    public void display(){
        if(hashtable == null){
            System.out.println("hastable is not present");
        }else{
            for(int i = 0;i<hashtable.length;i++){
                System.out.println("Index " + i + " Value : " + hashtable[i] );
            }
        }
    }

    public void Search(String word){
        int index = modAsciiValue(word,hashtable.length);
        if(hashtable[index] != null && hashtable[index].contains(word) ){
            System.out.println("Value Found");
        }else{
            System.out.println("Value Not Found");
        }
    }

    public void Delete(String word){
        int index = modAsciiValue(word,hashtable.length);
        if(hashtable[index] != null && hashtable[index].contains(word)){
            hashtable[index].remove(word);
            System.out.println("Value sucessfully removed");
        }else{
            System.out.println("Value not found");
        }
    }




}
