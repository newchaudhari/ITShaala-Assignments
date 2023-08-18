package __methods_practice;

import java.util.Scanner;

public class Demo2 {
    String movieName;
    int movieId;
    String getMovieName(){

        return movieName;
    }
    int getMovieId(){
        return movieId;
    }

    public static void main(String[] args) {
        Demo2 d=new Demo2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Movie Name");
        d.movieName=scanner.nextLine();
        System.out.println("Enter Movie Id");
        d.movieId= scanner.nextInt();
        System.out.println("Movie Name "+d.getMovieName());
        System.out.println("Movie Id "+d.getMovieId());
    }
}
