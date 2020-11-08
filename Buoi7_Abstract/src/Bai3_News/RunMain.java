package Bai3_News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<News> list = new ArrayList<>();
        int choose;
        do {
            System.out.println("===================Welcome=============");
            System.out.println("1: Insert news");
            System.out.println("2: View ");
            System.out.println("3: Everage rate");
            System.out.println("0: Exit");
            System.out.println("Enter your choise: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    News news = new News();
                    System.out.println("ID: ");
                    news.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Input your title: ");
                    news.setTitle(sc.nextLine());
                    System.out.println("Input publishDate: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.println("Input author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.println("Input Content: ");
                    news.setContent(sc.nextLine());
                    System.out.println("Input rate: ");
                    news.InputaverageRate();
                    list.add(news);
                    break;
                case 2:
                    for(int i=0;i<list.size();i++){
                        System.out.println("New number "+i);
                        list.get(i).Display();
                    }
                    break;
                case 3:
                    for(int i=0;i<list.size();i++){
                        list.get(i).Caculate();
                        System.out.println("New number"+i);
                        list.get(i).Display();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choose, choose again");
            }
        }while (true);
    }

}
