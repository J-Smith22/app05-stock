import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Joshua Smith 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
        product.increaseQuantity(amount);
    System.out.println("Product Delivered : " + product);
    }
    else
    {
    System.out.println("Product ID" + id + " NOT FOUND!!!");
    }
}

    public void sellProduct(int id)
    
    {
    Product product = findProduct(id);
    if(product != null)
    {
    product.sellOne();
    }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        if(product.getID() == id)
        {
        return product;
        
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
    }
    
    public void printStock()
    {
        printHeading();
    for(Product product : stock)
    {
    
        System.out.println(product);
    }
    
    }
    
    public void printHeading()
    {
    System.out.println("Smith's Stock List");
    System.out.println("------------------");
    System.out.println();
    }
}
