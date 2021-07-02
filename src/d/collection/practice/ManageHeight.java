package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    public static void main(String[] args){
        ManageHeight manager = new ManageHeight();
        manager.setData();
        for(int i=0;i<5;i++)
            manager.printAverage(i);

    }
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
    public void setData(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(170);
        list1.add(180);
        list1.add(173);
        list1.add(175);
        list1.add(177);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(160);
        list2.add(165);
        list2.add(167);
        list2.add(186);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(158);
        list3.add(177);
        list3.add(187);
        list3.add(176);

        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list4.add(173);
        list4.add(182);
        list4.add(181);

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        list5.add(170);
        list5.add(180);
        list5.add(165);
        list5.add(177);
        list5.add(172);

        gradeHeights.add(list1);
        gradeHeights.add(list2);
        gradeHeights.add(list3);
        gradeHeights.add(list4);
        gradeHeights.add(list5);

    }

    public void printHeight(int classNo){
        System.out.println("Class NO.:"+(classNo+1));
        for(int i=0;i<gradeHeights.get(classNo).size();i++){
            System.out.println(gradeHeights.get(classNo).get(i));
        }
    }
    public void printAverage(int classNo){
        System.out.println("Class NO.:"+(classNo+1));
        double sum = 0.0;
        for(int i=0;i<gradeHeights.get(classNo).size();i++){
            sum += gradeHeights.get(classNo).get(i);
        }

        System.out.println(sum/(double)gradeHeights.get(classNo).size());
    }
}
