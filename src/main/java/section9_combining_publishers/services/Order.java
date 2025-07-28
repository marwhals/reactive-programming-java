package section9_combining_publishers.services;

// just for demo
// we have user id in the order to show that it belongs to the user
public record Order(Integer userId,
                    String productName,
                    Integer price) {
}
