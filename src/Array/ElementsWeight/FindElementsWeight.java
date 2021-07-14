package Array.ElementsWeight;
public class FindElementsWeight {
    static int perfectsquare(int element){
        for(int iterator=1;iterator<=element/2;iterator++){
            if(element%iterator==0&&element/iterator==iterator) return 5;
        }
        return 0;
    }
    static int multiple(int element){
        if(element%4==0&&element%6==0) return 4;
        return 0;
    }
    static int even(int element){
        if(element%2==0) return 3;
        return 0;
    }
    static int weightof(int element){
        return perfectsquare(element)+multiple(element)+even(element);
    }
    void output(int size,int[]array){
        int[]weight=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            weight[iterator]=weightof(array[iterator]);
        }
        for(int iterator=0;iterator<size;iterator++){
            int min=weight[iterator],index=iterator;
            for(int iterator1=iterator+1;iterator1<size;iterator1++){
                if(weight[iterator1]<min){
                    min=weight[iterator1];
                    index=iterator1;
                }
            } 
            int temp=weight[iterator];
            weight[iterator]=weight[index];
            weight[index]=temp;
            temp=array[iterator];
            array[iterator]=array[index];
            array[index]=temp;
        }
        for(int iterator=0;iterator<size;iterator++){
            System.out.print("<"+array[iterator]+","+weight[iterator]+">");
        }
    }
}