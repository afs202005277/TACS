# Entity-Relationship to Relational Database Transformation

## Overview
This project implements a model-driven approach to transforming an Entity-Relationship (ER) model into a Relational Database (RDB) schema using the Eclipse Modeling Framework (EMF). It utilizes the ATL (Atlas Transformation Language) for model-to-model transformations and Acceleo for model-to-text transformations, generating valid SQL scripts from conceptual data models.

## Features
- **Metamodeling with EMF**: Defines a structured ERModel and an RDBModel.
- **OCL Constraints**: Enforces data integrity rules at both conceptual and relational levels.
- **Model-to-Model Transformation**: Uses ATL to convert ER models into relational database schemas.
- **Model-to-Text Transformation**: Uses Acceleo to generate SQL Data Definition Language (DDL) scripts.
- **Testing Framework**: Includes a suite of XMI-based test cases to validate model constraints and transformation correctness.

## Project Structure
```
├── model/                     # Ecore models defining the ER and RDB metamodels
├── ERtoRDBTransformation/     # ATL transformation project
│   ├── ERtoRDBTransformation.atl  # ATL transformation rules
│   ├── Transformed/               # Generated RDB models
├── RDBtoTextTransformation/   # Acceleo transformation project
│   ├── src/
│   │   ├── RDBtoTextTransformation/main/generate.mtl  # Acceleo templates
│   ├── GeneratedSQL/           # Output SQL scripts
├── xmi_examples_tests/        # Test cases in XMI format
│   ├── ER_*.xmi               # ER model test cases
│   ├── RDB_*.xmi              # RDB model test cases
│   ├── *.sql                  # Expected SQL outputs
├── README.md                  # Project documentation
```

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Open the project in Eclipse with the **EMF, ATL, and Acceleo plugins** installed.
3. Run the ATL transformation to generate an RDB model from an ER model.
4. Run the Acceleo transformation to generate SQL scripts from the RDB model.

## Usage
### Model-to-Model Transformation (ATL)
- Open the `ERtoRDBTransformation.atl` file in Eclipse.
- Run the transformation on an ERModel XMI instance.
- The transformed RDB model will be stored in `ERtoRDBTransformation/Transformed/`.

### Model-to-Text Transformation (Acceleo)
- Open `generate.mtl` in Acceleo.
- Execute the transformation on an RDBModel instance.
- The generated SQL script will be placed in `GeneratedSQL/`.

## Testing
The project follows a **Test-Driven Development (TDD)** approach with 16 structured test cases:
- **ER Model Tests:** Validate constraints on entities, attributes, relationships, and cardinalities.
- **RDB Model Tests:** Ensure proper enforcement of table constraints, primary keys, and foreign keys.
- **End-to-End Tests:** Compare generated SQL with expected manually-written SQL for real-world examples (Library System, University System, F1 Calendar).

To run tests:
1. Load the test XMI files in Eclipse.
2. Apply the ER-to-RDB ATL transformation.
3. Apply the RDB-to-SQL Acceleo transformation.
4. Compare the generated SQL scripts with expected outputs.
