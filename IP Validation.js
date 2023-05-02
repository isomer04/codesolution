function isValidIP(str) {
  // Split the string into octets
  var octets = str.split(".");
  
  // Check that there are exactly 4 octets
  if (octets.length !== 4) {
    return false;
  }
  
  // Check each octet for validity
  for (var i = 0; i < 4; i++) {
    var octet = octets[i];
    
    // Check that the octet is a number between 0 and 255
    if (isNaN(octet) || parseInt(octet) < 0 || parseInt(octet) > 255) {
      return false;
    }
    
    // Check that the octet doesn't have leading zeros, except for 0 itself
    if (octet.length > 1 && octet[0] === "0") {
      return false;
    }
  }
  
  // All checks passed, so the IP is valid
  return true;
}
