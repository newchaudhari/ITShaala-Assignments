package __oops.anonymousclass;

public class MovieCollectionImpl {
    public static void main(String[] args) {
        MovieCollection movie1 = new MovieCollection() {
            @Override
            public void movieId(int id) {
                System.out.println("Id: " + id);

            }

            @Override
            public void movieType(String str) {
                System.out.println("Movie type: " + str);
            }

            @Override
            public void movieName(String str) {
                System.out.println("Movie name: " + str);
            }
        };
        MovieCollection movie2 = new MovieCollection() {
            @Override
            public void movieId(int id) {
                System.out.println("Id: " + id);
            }

            @Override
            public void movieName(String str) {
                System.out.println("Movie name: " + str);
            }

            @Override
            public void movieType(String str) {
                System.out.println("Movie type: " + str);

            }
        };
        movie1.movieId(1);
        movie1.movieName("Bell Bottom");
        movie1.movieType("Spy");
        System.out.println();
        movie2.movieId(2);
        movie2.movieName("Golmal");
        movie2.movieType("Comedy");
    }
}
