# Context

Built an application to manage E-Commerce Fashion categories in a tree structure

#### Data Sample:
##### 
    -Women
        - Clothing
            - Dresss
                - Causal Dresses
                - Party Dresses
        - T-Shirts
            - Printed T-shirts
            - Causal T-Shirts
            - Plain T-Shirts
    -Men
        - Footwear
            - Branded
            - Non Branded
        - T-Shirts
            - Printed T-shirts
            - Causal T-Shirts
            - Plain T-Shirts
        - Shirts
            - Party Shirts
            - Causal Shirts
            - Plain Shirts
            

### Task

1. Design an api that can display the categories in Hierarchical(Tree View) in N number of levels
2. Design 3 API endpoint that will create/update/delete categories
3. Display the category in tree structure.


## Requirements
### Functionality
1. The API should follow typical RESTful API design pattern.
2. The data should be saved in the DB.
3. Provide proper unit test

## Tech stack
1. In any of these backend technology:  Java/Node.JS/Python/GoLang
2. Frontend: React/Angular (BONUS)

## Evaluation
1. Readable and Structured Code
2. Logical implementation
2. Covering all the edge-cases scenarios in the Unit Test


### Bonus
1. Write good in-code comments.
3. Write good commit messages.

### Time
1. Task has completed in 9 hours
2. Submission Date: Within 7 Days.

### How to Start
1. Clone this Repository
2. Commit the code and test cases to your cloned repository.
3. DO NOT Fork this repository
4. DO NOT raise PR to this repository

### Postman Script to Test
POST - http://localhost:8080/categories
{
    "type": "Men",
    "mens": {
        "footwear": {
            "branded": "Branded",
            "nonBranded": "nonBranded"
        },
        "tshirts": {
            "printedTshirts": "Printed T-shirts2",
            "causalTShirts": "Causal T-Shirts",
            "plainTShirts": "Plain T-Shirts"
        },
        "shirts": {
            "partyShirts": "Shirts",
            "causalShirts": "Causal Shirts",
            "plainShirts": "Plain Shirts"
        }
    },
    "womens": {
        "dress": {
            "casualDresses": "casualDresses",
            "partyDresses": "partyDresses"
        },
        "tshirts": {
            "printedTshirts": "Printed T-shirts",
            "causalTShirts": "Causal T-Shirts",
            "plainTShirts": "Plain T-Shirts"
        }
    }
}

## Getting All Data
GET http://localhost:8080/categories

## Deleting All Data
DELETE http://localhost:8080/categories

## Delete by id
DELETE http://localhost:8080/categories/1

## Updating data by id
PUT http://localhost:8080/categories/1
{
    "type": "Men",
    "mens": {
        "footwear": {
            "branded": "B31",
            "nonBranded": "NBB"
        },
        "tshirts": {
            "printedTshirts": "Printed T-shirt",
            "causalTShirts": "Causal T-Shirts",
            "plainTShirts": "Plain T-Shirts"
        },
        "shirts": {
            "partyShirts": "Shirts",
            "causalShirts": "Causal Shirts",
            "plainShirts": "Plain Shirts"
        }
    },
    "womens": {
        "dress": {
            "casualDresses": "casualDresses",
            "partyDresses": "partyDresses"
        },
        "tshirts": {
            "printedTshirts": "Printed T-shirts11x2",
            "causalTShirts": "Causal T-Shirts11x2",
            "plainTShirts": "Plain T-Shirts11x2"
        }
    }
}

