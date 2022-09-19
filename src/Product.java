public class Product {
    private int id;
    private String title;
    private float price;

    public Product(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}


class ProductComparatorByPrice implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Product p1 = (Product) obj1;
        Product p2 = (Product) obj2;

        if(p1.getPrice() > p2.getPrice()) {
            return 1;
        }

        if(p1.getPrice() < p2.getPrice()) {
            return -1;
        }

        return 0;
    }
}
