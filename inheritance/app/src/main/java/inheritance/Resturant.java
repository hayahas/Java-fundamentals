package inheritance;

import java.util.ArrayList;

public class Resturant {


    private String resturantName;
     private int starsOutOf5;
     private double priceCategory;

     private ArrayList <Review> Reviews ;

    public Resturant(String resturantName,int starsOutOf5,double priceCategory){
           this.resturantName=resturantName;
           this.starsOutOf5= (int)Math.floor(Math.random() * (5 - 0 + 1) + 0);
           this.priceCategory=priceCategory;
           this.Reviews= new ArrayList<>();
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public void setStarsOutOf5(int starsOutOf5) {
        this.starsOutOf5 = starsOutOf5;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getResturantName() {
        return resturantName;
    }

    public double getPriceCategory() {
        return priceCategory;
    }

    public int getStarsOutOf5() {
        return starsOutOf5;
    }

    public void setReviews(ArrayList<Review> reviews) {
        Reviews = reviews;
    }

    public ArrayList<Review> getReviews() {
        return Reviews;
    }


    public void addReview(Review review){
        Reviews.add(review);

    }
    package inheritance.app.src.main.java.inheritance;

import java.util.ArrayList;

    public class Restaurant {
        private String name;
        private int stars;
        private int priceCategory;
        private ArrayList<Review> reviews;

        public Restaurant(String name, int stars, int priceCategory) {
            this.name = name;
            this.stars = Math.max(0, Math.min(5, stars)); //because it's from 1-5
            this.priceCategory = priceCategory;
            this.reviews = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStars() {
            return stars;
        }

        public void setStars(int stars) {
            this.stars = stars;
        }

        public int getPriceCategory() {
            return priceCategory;
        }

        public void setPriceCategory(int priceCategory) {
            this.priceCategory = priceCategory;
        }

        public ArrayList<Review> getReviews() {
            return reviews;
        }

        public void setReviews(ArrayList<Review> reviews) {
            this.reviews = reviews;
        }

        public void addReview(Review review) {
            reviews.add(review);
            updateStars();
        }

        private void updateStars() {
            int totalStars = 0;
            for (Review review : reviews) {
                totalStars += review.getNumOfStarts();
            }
            if (!reviews.isEmpty()) {
                stars = totalStars / reviews.size();
            } else {
                stars = 0;
            }
        }

        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", stars=" + stars +
                    ", priceCategory=" + priceCategory +
                    '}';
        }
    }
    @Override
    public String toString() {
        return ("Welcome to " + resturantName + " Resturants"
        + "stars : " + starsOutOf5 +" , Price Category" + priceCategory );
    }
}
