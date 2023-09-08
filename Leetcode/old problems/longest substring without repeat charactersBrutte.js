const string = "abccabb";

// Time : O(N^2) because of two nested for loop
// Space: O(N)

const lengthOfLongestSubstring = function (s) {
	if(s.length <= 1) return s.length;

	let longest = 0;

	for(let left = 0; left < s.length; left++){
		let seenChars = { }, currentLength = 0;

		for(let right = left; right < s.length; right++){
			const currentChar = s[right];

			if(!seenChars[currentChar]) {
				currentLength++;
				console.log(seenChars[currentChar] + " This is seenchars before true");

				seenChars[currentChar] = true;
				console.log(currentChar + " this is only currentChar");
				console.log(seenChars + " this is seenChars");
								console.log(seenChars[currentChar]);

				longest = Math.max(longest, currentLength);

			} else { 
				break;
				
			}
		}
	}

	return longest;
};

console.log(lengthOfLongestSubstring(string));