# 💱 Currency Converter (Core Java)

A console-based Currency Converter application built using Core Java.

This program allows users to convert money between different international currencies and also update exchange rates manually.

The project is designed to demonstrate practical usage of **Object Oriented Programming (OOP)** and menu-driven programming logic.

---

## 🎯 Objective

To understand real-world implementation of:

- Classes & Objects
- Inheritance
- Mathematical calculations
- User input handling (Scanner)
- Menu driven applications
- Runtime data modification

---

## 🧠 OOP Design

The program uses inheritance:

```
variable → CurrencyConverter → RUN_CURRENCY(Main)
```

| Class | Responsibility |
|------|------|
| `variable` | Stores exchange rates & variables |
| `CurrencyConverter` | Performs conversion & update operations |
| `RUN_CURRENCY` | Main menu & program execution |

---

## 🌍 Supported Currencies

- Indian Rupee (INR)
- US Dollar (USD)
- Euro (EUR)
- UAE Dirham (AED)
- British Pound (GBP)
- Canadian Dollar (CAD)

---

## 📌 Features

### 💰 Currency Conversion
User can convert between any supported currencies:

Example:
- INR → USD
- USD → EURO
- AED → INR
- POUND → CAD

---

### 🔄 Update Exchange Rate
User can manually update exchange rate during runtime.

Example:
```
Update INR to USD rate
Update USD to EURO rate
Update AED to INR rate
```

The program automatically recalculates reverse rate.

---

### 📋 Menu Driven Interface

Main Menu:

1. Display Available Currency  
2. Currency Conversion  
3. Update Exchange Rate  
4. Exit  

---

## ▶️ How to Run

### Compile
```bash
javac CurrencyConverter.java
```

### Run
```bash
java CurrencyConverter
```

---

## 💻 Technologies Used
- Java (Core Java)
- OOP Concepts
- Console Input/Output

---

## 📖 Concepts Demonstrated

- Inheritance
- Method calling between classes
- Switch-case logic
- Mathematical calculations
- Runtime data modification

---

## ⚠️ Limitations
- Exchange rates are manual (not real-time)
- No API integration
- Console based interface
- Data resets after program ends

---

## 🚀 Future Improvements
- Live exchange rates using API
- GUI interface (JavaFX/Swing)
- Currency history tracking
- Save updated rates to file/database

---

## 👨‍💻 Author
**Yashrajsinh Kanchva**

GitHub:  
https://github.com/Yashrajsinh-Kanchva
---

## 📄 Note
This project is created for learning Core Java programming and OOP concepts.
