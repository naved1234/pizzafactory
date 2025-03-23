# PizzaFactory

PizzaFactory is a modular, object-oriented Java application that simulates a pizza ordering system for a self-service kiosk.

It supports multiple pizzas, customizations (crusts, toppings), business rule validation, side orders, and basic inventory management.

---

## Features

- Select vegetarian or non-vegetarian pizzas
- Choose crust types and extra toppings
- Add sides like Cold Drink and Mousse Cake
- Validates orders against business rules
- Manages inventory availability (mocked)
- Clean architecture using:
    - SOLID principles
    - Factory Pattern
    - Strategy Pattern (for validation rules)
- JUnit 5 test suite included

---

## Project Structure

```
src/
├── main/
│   └── java/com/pizzafactory/
│       ├── model/          # Domain models (Pizza, Topping, Order, etc.)
│       ├── factory/        # PizzaFactory (Factory Pattern)
│       ├── validation/     # Business rules (Strategy Pattern)
│       ├── service/        # Order and Inventory services
│       ├── controller/     # OrderController entry point
│       └── Main.java       # CLI Simulation
│
└── test/
    └── java/com/pizzafactory/
        ├── model/          # Order calculation tests
        ├── factory/        # PizzaFactory tests
        ├── service/        # OrderService & InventoryService tests
        └── validation/     # Business rule tests
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

### Setup

1. Clone this repo
   ```bash
   git clone https://github.com/yourname/pizzafactory.git
   cd pizzafactory
   ```

2. Build the project
   ```bash
   mvn clean install
   ```

3. Run the CLI app
   ```bash
   mvn exec:java -Dexec.mainClass="com.pizzafactory.Main"
   ```

> You can also run it directly via your IDE using `Main.java`

---

## Business Rules

- Vegetarian pizza cannot have non-veg toppings
- Non-veg pizza cannot have paneer topping
- Only one crust type per pizza
- Only one non-veg topping allowed on non-veg pizza
- Large pizzas allow 2 free toppings; others cost extra

---

## Running Tests

```bash
mvn test
```

Covers:
- Order validation
- Topping restrictions
- Factory instantiation
- Price calculations
