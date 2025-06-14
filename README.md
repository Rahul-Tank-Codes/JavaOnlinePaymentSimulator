# 💳 Java Online Payment System Simulator

A **Java console-based application** that simulates real-world online payment processing using credit cards, debit cards, and wallets. This project is crafted to strengthen **core Java fundamentals** like Object-Oriented Programming (OOP), interfaces, polymorphism, encapsulation, and custom exception handling.

> 🚀 Built as a hands-on learning project to transition from Java basics to real-world development confidence.

---

## ✨ Features

- 💼 **Multiple Payment Modes** (Credit Card, Debit Card, Wallet)
- 🧠 **Polymorphic Design** using interfaces and method overriding
- 🔐 **Encapsulation** to protect payment data
- ⚠️ **Custom Exceptions** for invalid or failed transactions
- 🔁 **Looping structure** to handle multiple user operations
- 📂 **Clean, modular class structure** for maintainability and scalability

---

## 🛠️ Concepts Practiced

| Concept              | How It's Used                                             |
|----------------------|-----------------------------------------------------------|
| OOP Principles        | Separate classes for payment types with inheritance and abstraction |
| Polymorphism          | Interface-based method calls like `processPayment()`     |
| Encapsulation         | Private fields and public getters/setters                |
| Interfaces            | `Payment` interface implemented by all payment types     |
| Custom Exceptions     | `InvalidAmountException`, etc., with try-catch handling  |
| Control Flow & Loops  | Repeated payment simulation in the main method           |

---

## 📦 Project Structure

```plaintext
JavaOnlinePaymentSimulator/
├── Payment.java
├── CreditCardPayment.java
├── DebitCardPayment.java
├── WalletPayment.java
├── InvalidAmountException.java
├── PaymentProcessor.java
└── Main.java
