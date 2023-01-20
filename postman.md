# CabBookingApp

---
![Badge](https://visitor-counter-badge.vercel.app/api/TusharKadam7671/CabBookingApp)
---


## Admin module

---

## POST /cab247.in/api/admin/save
- **Request URL** - http://localhost:8888/cab247.in/api/admin/save
- **Request Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Radhanagari society",
    "addressLine2": "Ring road",
    "city": "Pune",
    "country": "India",
    "pincode": "415415"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 0
}
```
- **Response Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Radhanagari society",
    "addressLine2": "Ring road",
    "city": "Pune",
    "country": "India",
    "pincode": "415415"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 1
}
```
---

## PUT /cab247.in/api/admin/update
- **Request URL** - http://localhost:8888/cab247.in/api/admin/update
- **Request Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Parijat society",
    "addressLine2": "D3/B",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 1
}
```
- **Response Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Parijat society",
    "addressLine2": "D3/B",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 1
}
```
---


## GET /cab247.in/api/admin/{adminId}
- **Request URL** - http://localhost:8888/cab247.in/api/admin/1
- **Response Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Parijat society",
    "addressLine2": "D3/B",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 1
}
```
---

## GET /cab247.in/api/admin/allBookings
- **Request URL** - http://localhost:8888/cab247.in/api/admin/allBookings

- **Response Body**
```JSON
{
  "timestamp": "2023-01-04T14:22:43.1561226",
  "message": "No booking data is available",
  "details": "uri=/cab247.in/api/admin/allBookings"
}
```
---

## DELETE /cab247.in/api/admin/delete/{adminId}
- **Request URL** - http://localhost:8888/cab247.in/api/admin/delete/1

- **Response Body**
```JSON
{
  "username": "Admin1",
  "password": "admin1111",
  "address": {
    "addressLine1": "Parijat society",
    "addressLine2": "D3/B",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7219497671",
  "email": "admin1@gmail.com",
  "role": "ROLE_ADMIN",
  "adminId": 1
}
```
---

# Cab Module

---
## POST /cab247.in/api/cab/add
- **Request URL** - http://localhost:8888/cab247.in/api/cab/add
- **Request Body**
```JSON
{
  "cabId": 0,
  "cabType": "Radio Taxi",
  "perKMrate": 25
}
```
- **Response Body**
```JSON
{
  "cabId": 2,
  "cabType": "Radio Taxi",
  "perKMrate": 25
}
```
---
---
## PUT /cab247.in/api/cab/update
- **Request URL** - http://localhost:8888/cab247.in/api/cab/update
- **Request Body**
```JSON
{
  "cabId": 1,
  "cabType": "Radio Taxi",
  "perKMrate": 25
}
```
- **Response Body**
```JSON
{
  "cabId": 1,
  "cabType": "Radio Taxi",
  "perKMrate": 30
}
```
---
## GET /cab247.in/api/cab/view
- **Request URL** - http://localhost:8888/cab247.in/api/cab/view
- **Response Body**
```JSON
[
  {
    "cabId": 1,
    "cabType": "Radio Taxi",
    "perKMrate": 25
  },
  {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
]
```
---
## GET /cab247.in/api/cab/view/{cabId}
- **Request URL** - http://localhost:8888/cab247.in/api/cab/view/4
- **Response Body**
```JSON
{
  "cabId": 4,
  "cabType": "Tourist cabs",
  "perKMrate": 20
}
```
---
## GET /cab247.in/api/cab/view/cabType
- **Request URL** - http://localhost:8888/cab247.in/api/cab/view/cabType?cabType=Tourist%20cabs
- **Response Body**
```JSON
[
  {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  },
  {
    "cabId": 5,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
]
```
---
## DELETE /cab247.in/api/cab/delete/{cabId}
- **Request URL** - http://localhost:8888/cab247.in/api/cab/delete/5
- **Response Body**
```JSON
{
  "cabId": 5,
  "cabType": "Tourist cabs",
  "perKMrate": 20
}
```
---

# Driver Module

---
## POST /cab247.in/api/driver/add
- **Request URL** - http://localhost:8888/cab247.in/api/driver/add
- **Request Body**
```JSON
{
  "username": "driver1",
  "password": "driver1111",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 0,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
- **Response Body**
```JSON
{
  "username": "driver1",
  "password": "driver1111",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 1,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
---
## PUT /cab247.in/api/driver/update
- **Request URL** - http://localhost:8888/cab247.in/api/driver/update
- **Request Body**
```JSON
{
  "username": "Newdriver1",
  "password": "driver2222",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 1,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
- **Response Body**
```JSON
{
  "username": "Newdriver1",
  "password": "driver2222",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 1,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
---
## GET /cab247.in/api/driver/view
- **Request URL** - http://localhost:8888/cab247.in/api/driver/view
- **Response Body**
```JSON
[
  {
    "username": "Newdriver1",
    "password": "driver2222",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 1,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  }
]
```
---
## GET /cab247.in/api/driver/view/{driverId}
- **Request URL** - http://localhost:8888/cab247.in/api/driver/view/1
- **Response Body**
```JSON
{
  "username": "Newdriver1",
  "password": "driver2222",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 1,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
---
## DELETE /cab247.in/api/driver/delete/{driverId}
- **Request URL** - http://localhost:8888/cab247.in/api/driver/delete/1
- **Response Body**
```JSON
{
  "username": "Newdriver1",
  "password": "driver2222",
  "address": {
    "addressLine1": "16B,sector 10",
    "addressLine2": "sion",
    "city": "Mumbai",
    "country": "India",
    "pincode": "412403"
  },
  "mobileNumber": "7040192291",
  "email": "driver1@gmail.com",
  "role": "ROLE_DRIVER",
  "driverId": 1,
  "licenceNo": "LCN100108",
  "ratings": 5,
  "cab": {
    "cabId": 4,
    "cabType": "Tourist cabs",
    "perKMrate": 20
  }
}
```
---

# Customer Module
## POST /cab247.in/api/customer/add
- **Request URL** - http://localhost:8888/cab247.in/api/customer/add
- **Request Body**
```JSON
{
  "username": "customer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 54",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "customer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 0
}
```
- **Response Body**
```JSON
{
  "username": "customer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 54",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "customer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 1
}
```
---
## PUT /cab247.in/api/customer/update
- **Request URL** - http://localhost:8888/cab247.in/api/customer/update
- **Request Body**
```JSON
{
  "username": "Newcustomer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 04",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "newcustomer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 1
}
```
- **Response Body**
```JSON
{
  "username": "Newcustomer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 04",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "newcustomer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 1
}
```
---
## GET /cab247.in/api/customer/view
- **Request URL** - http://localhost:8888/cab247.in/api/customer/view
- **Response Body**
```JSON
[
  {
    "username": "Newcustomer1",
    "password": "customer1111",
    "address": {
      "addressLine1": "Green Leaf Garden",
      "addressLine2": "Street no. 04",
      "city": "Mumbai",
      "country": "India",
      "pincode": "401401"
    },
    "mobileNumber": "7218487588",
    "email": "newcustomer1@gmail.com",
    "role": "ROLE_CUSTOMER",
    "customerId": 1
  }
]
```
---
## GET /cab247.in/api/customer/view/{customerId}
- **Request URL** - http://localhost:8888/cab247.in/api/customer/view/1
- **Response Body**
```JSON
{
  "username": "Newcustomer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 04",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "newcustomer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 1
}
```
---
## DELETE /cab247.in/api/customer/delete/{customerId}
- **Request URL** - http://localhost:8888/cab247.in/api/customer/delete/1
- **Response Body**
```JSON
{
  "username": "Newcustomer1",
  "password": "customer1111",
  "address": {
    "addressLine1": "Green Leaf Garden",
    "addressLine2": "Street no. 04",
    "city": "Mumbai",
    "country": "India",
    "pincode": "401401"
  },
  "mobileNumber": "7218487588",
  "email": "newcustomer1@gmail.com",
  "role": "ROLE_CUSTOMER",
  "customerId": 1
}
```
---
---
# Booking Module

---
## POST /cab247.in/api/booking/add
- **Request URL** - http://localhost:8888/cab247.in/api/booking/add?customerId=2&driverId=2
- **Request Body**
```JSON
{
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966Z",
  "toDateTime": "2023-01-05T14:46:58.966Z",
  "status": true,
  "distanceInKm": 45
}
```
- **Response Body**
```JSON
{
  "bookingId": 1,
  "customerId": 2,
  "driver": {
    "username": "driver1",
    "password": "driver1111",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 2,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  },
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966",
  "toDateTime": "2023-01-05T14:46:58.966",
  "status": false,
  "distanceInKm": 45,
  "bill": 900
}
```
---
## PUT /cab247.in/api/booking/update
- **Request URL** - http://localhost:8888/cab247.in/api/booking/update
- **Request Body**
```JSON
{
  "bookingId": 1,
  "customerId": 2,
  "driver": {
    "username": "driver1",
    "password": "driver1111",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 2,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  },
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966",
  "toDateTime": "2023-01-05T14:46:58.966",
  "status": true,
  "distanceInKm": 45,
  "bill": 900
}
```
- **Response Body**
```JSON
{
  "bookingId": 1,
  "customerId": 2,
  "driver": {
    "username": "driver1",
    "password": "driver1111",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 2,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  },
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966",
  "toDateTime": "2023-01-05T14:46:58.966",
  "status": true,
  "distanceInKm": 45,
  "bill": 900
}
```
---
## GET /cab247.in/api/booking/view
- **Request URL** - http://localhost:8888/cab247.in/api/booking/view
- **Response Body**
```JSON
[
  {
    "bookingId": 1,
    "customerId": 2,
    "driver": {
      "username": "driver1",
      "password": "driver1111",
      "address": {
        "addressLine1": "16B,sector 10",
        "addressLine2": "sion",
        "city": "Mumbai",
        "country": "India",
        "pincode": "412403"
      },
      "mobileNumber": "7040192291",
      "email": "driver1@gmail.com",
      "role": "ROLE_DRIVER",
      "driverId": 2,
      "licenceNo": "LCN100108",
      "ratings": 5,
      "cab": {
        "cabId": 4,
        "cabType": "Tourist cabs",
        "perKMrate": 20
      }
    },
    "fromLocation": "sion",
    "toLocation": "kurla",
    "fromDateTime": "2023-01-05T14:46:28.966",
    "toDateTime": "2023-01-05T14:46:58.966",
    "status": true,
    "distanceInKm": 45,
    "bill": 900
  }
]
```
---
## GET /cab247.in/api/booking/view/{bookingId}
- **Request URL** - http://localhost:8888/cab247.in/api/booking/view/1
- **Response Body**
```JSON
{
  "bookingId": 1,
  "customerId": 2,
  "driver": {
    "username": "driver1",
    "password": "driver1111",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 2,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  },
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966",
  "toDateTime": "2023-01-05T14:46:58.966",
  "status": true,
  "distanceInKm": 45,
  "bill": 900
}
```
---
## GET /cab247.in/api/booking/view/customer/{customerId}
- **Request URL** - http://localhost:8888/cab247.in/api/booking/view/customer/2
- **Response Body**
```JSON
[
  {
    "bookingId": 1,
    "customerId": 2,
    "driver": {
      "username": "driver1",
      "password": "driver1111",
      "address": {
        "addressLine1": "16B,sector 10",
        "addressLine2": "sion",
        "city": "Mumbai",
        "country": "India",
        "pincode": "412403"
      },
      "mobileNumber": "7040192291",
      "email": "driver1@gmail.com",
      "role": "ROLE_DRIVER",
      "driverId": 2,
      "licenceNo": "LCN100108",
      "ratings": 5,
      "cab": {
        "cabId": 4,
        "cabType": "Tourist cabs",
        "perKMrate": 20
      }
    },
    "fromLocation": "sion",
    "toLocation": "kurla",
    "fromDateTime": "2023-01-05T14:46:28.966",
    "toDateTime": "2023-01-05T14:46:58.966",
    "status": true,
    "distanceInKm": 45,
    "bill": 900
  }
]
```
---
## GET /cab247.in/api/booking/bill/{customerId}
- **Request URL** - http://localhost:8888/cab247.in/api/booking/bill/2
- **Response Body**
```JSON
Total bill for customer with customerid 2 is 0.0 INR.
```
---
## DELETE /cab247.in/api/booking/delete/{bookingId}
- **Request URL** - http://localhost:8888/cab247.in/api/booking/delete/1
- **Response Body**
```JSON
{
  "bookingId": 1,
  "customerId": 2,
  "driver": {
    "username": "driver1",
    "password": "driver1111",
    "address": {
      "addressLine1": "16B,sector 10",
      "addressLine2": "sion",
      "city": "Mumbai",
      "country": "India",
      "pincode": "412403"
    },
    "mobileNumber": "7040192291",
    "email": "driver1@gmail.com",
    "role": "ROLE_DRIVER",
    "driverId": 2,
    "licenceNo": "LCN100108",
    "ratings": 5,
    "cab": {
      "cabId": 4,
      "cabType": "Tourist cabs",
      "perKMrate": 20
    }
  },
  "fromLocation": "sion",
  "toLocation": "kurla",
  "fromDateTime": "2023-01-05T14:46:28.966",
  "toDateTime": "2023-01-05T14:46:58.966",
  "status": true,
  "distanceInKm": 45,
  "bill": 900
}
```
---
