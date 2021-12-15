package day8employee

/**
 * A class containing all the details about the office location of an employee
 * City, Province, Region, Exact Address
 */
// Data Class -> automatic string conversion (toString())
// equal() checks the actual data
// we can use copy()
data class LocationDetails(
    var city: String,
    var province: String,
    var Region: String,
    var exactAddress: String
)
// Stringified value of the instantiated Object (JSON like)
// LocationDetails(city=Makati, province=Metro Manila, Region=NCR, exactAddress=1124 XYZ Building, Legaspi Village)

// Map version of the object above
//{ city=Makati, province=Metro Manila, Region=NCR, exactAddress=1124 XYZ Building, Legaspi Village }