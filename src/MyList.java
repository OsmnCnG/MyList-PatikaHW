import java.util.*;
public class MyList<T> {
    private int Capacity=10;
    private int dimensionSize=0;


    T[] list;
    T[] listTemp;
    public MyList(){
        this.Capacity=10;
        this.setList();
    }
    public MyList(int Capacity){
        this.Capacity = Capacity;
        this.setList();
    }

    public int getIndex(int index) {
        System.out.println("The value on the "+index+". Index\t:"+list[index]);
        return (int) list[index];
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (int i =0;i<dimensionSize;i++) {
            if(list[i] != null) {
                System.out.print(list[i] + ",");
            }



        }
        System.out.print("]");
        return "";
    }

    public void remove(int index){
        System.out.println("Index:"+index+" deleted.");
        list[index]=null;
        for(int i=0;i<dimensionSize;i++){
            list[index]=list[index+1];
            index++;
        }

    }

    public void increaseCapacity(){
        System.out.println("Array kapasitesi artırıldı.");
        System.out.println("=========================\n");

        T[] listTemp= (T[]) new Object[this.Capacity];
        for(int i=0; i< dimensionSize; i++){
            listTemp[i]=list[i];
        }
        this.list=listTemp;

    }

    public int getCapacity() {
        return Capacity;
    }

    public void add(T data){

        if(size()<Capacity){
            list[dimensionSize]=data;
            dimensionSize++;
            System.out.println("Yeni bir eleman eklendi\t:" + data);
        }else if(size()==Capacity){
            System.out.println("===========\n***WARNING***!\nArray kapasitesi doldu.\n===========");
            Capacity *= 2;
            increaseCapacity();
            list[dimensionSize]=data;
            dimensionSize++;
            System.out.println("Yeni bir eleman eklendi\t:" + data);
        }else{
            System.out.println("error!");
        }




    }

    public void setList(){
        this.list= (T[]) new Object[this.Capacity];
    }


    public int size() {
        return dimensionSize;
    }


    public int indexOf(T data) {

        for(int i = 0; i<list.length;i++){
            if(data==list[i]){
                return i;
            }

        }
        return -1;

    }
}
