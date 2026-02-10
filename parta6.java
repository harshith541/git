import java.util.Scanner;
import  java.util.ArrayList;
class media
{
    String title;
    int duration;
    media(String title,int duration )
    {
        this.title=title;
        this.duration=duration;
    }
    void displaymedia()
    {
        System.out.println("Title:"+title);
        System.out.println("Duration:"+duration);
    }
}
class Movie extends media
{
    String genre;
    String language;
    String director;
    int releaseYear;
    Movie(String title,int duration,String genre,String language,String director,int releaseYear)
    {
        super(title,duration);
        this.genre=genre;
        this.language=language;
        this.director=director;
        this.releaseYear=releaseYear;
    }
    void displayShow()
    {
        super.displaymedia();
        System.out.println("Genre:"+genre);
        System.out.println("Language:"+language);
        System.out.println("Director:"+director);
        System.out.println("ReleaseYear:"+releaseYear);
    }
}
public class parta6    
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Movie>movies=new ArrayList<>();
       int choice;
       do{
        System.out.println("Movie Managament System");
        System.out.println("1.Adding Movie");
        System.out.println("2.Display all movie");
        System.out.println("3.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Movie Titel:");
                String title=sc.nextLine();
                System.out.println("Enter the movie duration(in Minutes):");
                int duration=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter genre:");
                String genre=sc.nextLine();
                System.out.println("Enter Language:");
                String language=sc.nextLine();
                System.out.println("Enter Director:");
                String director=sc.nextLine();
                System.out.println("Enter ReleaseYear:");
                int releaseYear=sc.nextInt();
                Movie m=new Movie(title, duration, genre, language, director, releaseYear);
                movies.add(m);
                S ystem.out.println("Movie Added Sucessfully:");
                break;
            case 2:
                if(movies.isEmpty())
                {
                    System.out.println("No movie");
                }else
                {
                    System.out.println("show movies");
                    for(Movie movie:movies){
                        movie.displayShow();
                    }
                }
                break;
            case 3:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice:");
        }
       }while(choice!=3);
       sc.close();
    }
}
