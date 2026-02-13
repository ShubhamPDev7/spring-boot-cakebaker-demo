# 🍰 CakeBaker - Spring Boot Dependency Injection Demo

This is my first hands-on project with **Spring Boot** internals. I built this to move beyond just watching tutorials and actually understand how the **IoC Container** works under the hood.

## 🎯 What I Learned (The Real Stuff)
I used to think Dependency Injection was just magic, but building this helped me understand:
- **Interfaces vs Implementations:** Why we code to an interface (`Frosting`) so the Baker doesn't care if it's Chocolate or Strawberry.
- **Solving Conflicts:** How to use `@Primary` when Spring gets confused between two beans of the same type.
- **The "Static" Mistake:** I spent a good 30 minutes stuck on a `static context` error because I tried to call the class `CakeBaker.bakeCake()` instead of the injected instance `cakeBaker.bakeCake()`. Fixing that finally clicked the concept of "Beans are objects, not classes" for me.

## 🛠️ How It Works
1. **The Interfaces:** defined `Frosting` and `Syrup` contracts.
2. **The Flavors:** Created `@Component` classes for Chocolate and Strawberry.
3. **The Baker:** Used **Constructor Injection** to wire everything together without using `new`.
4. **The Run:** Used `CommandLineRunner` to execute the logic on startup.

## 🚀 How to Run
1. Clone the repo.
2. Run `mvn spring-boot:run`.
3. Check the console—you should see the Baker mixing the ingredients based on which beans are marked `@Primary`.
