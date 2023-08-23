# Spring Boot eCommerce Project

This repository contains the backend implementation of an eCommerce platform developed using Spring Boot. The project features a robust authentication system utilizing JSON Web Tokens (JWT) for secure user login and signup. With JWT authentication in place, users can securely access the platform, enabling a personalized experience while ensuring data privacy.

## Features

### Cart and Cart Items Management

Our backend includes a robust cart management system. Users can create carts, add items, update quantities, and remove items from their carts. The `CartItemService` offers the following functionalities:

- Create and update cart items associated with a user's cart.
- Check if a cart item already exists for a specific product and user.
- Remove cart items based on user and cart item IDs.

The `CartService` complements this by providing cart creation and retrieval capabilities. Users can view their cart contents and make changes as needed.

### Order Management

We understand the importance of efficient order management. The `OrderService` ensures a seamless order experience:

- Create orders for users, including specifying a shipping address.
- Retrieve order details by order ID.
- Provide a user's order history for quick reference.
- Manage the order lifecycle through stages like placed, confirmed, shipped, delivered, and canceled.
- Admins can view and manage all orders.

### Product Handling

Our backend offers comprehensive product-related functionalities via the `ProductService`:

- Admins can create products, update product details, and delete products using the `createProduct`, `updateProduct`, and `deleteProduct` methods.
- Users and admins can access product information using methods like `findProductById`, `findProductByCategory`, and `searchProduct`.
- Products can be fetched based on specific criteria, including category, price range, discount, and more.

### Ratings and Reviews

We believe in empowering users to share their opinions. The `RatingServices` enable users to:

- Create product ratings and reviews, contributing to a collaborative shopping experience.
- Retrieve product ratings to aid in decision-making.

### User Management

User-centric features are essential for any eCommerce platform. Our `UserService` facilitates:

- Retrieval of user profiles by ID and JWT.
- Managing user accounts and associated data.

## Getting Started

To explore this project locally, follow these steps:

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd <project-directory>`
3. Configure application properties to match your database and system requirements.
4. Run the application: `./mvnw spring-boot:run`


