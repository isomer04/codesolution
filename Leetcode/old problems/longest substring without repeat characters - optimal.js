const string = "auaaddddsd";

const lengthOfLongestSubString = function(s) {
	if(s.length <= 1) return s.length;

	const seen = {};
	// using Map to speed up in the leetcode
	const seen = new Map();

	let left = 0, longest = 0;

	for(let right = 0; right < s.length; right++){
		const currentChar = s[right];
		// const previouslySeenChar = seen[currentChar];
				const previouslySeenChar = seen.get(currentChar);


		if(previouslySeenChar >= left){
			left = previouslySeenChar + 1;
			console.log(previouslySeenChar + " this is previouslySeenChar");
			console.log(left+ " this is left");
		}

		// seen[currentChar] = right;
				seen.set(currentChar, right);


		longest = Math.max(longest, right - left + 1);
	}

	return longest;
}

console.log(lengthOfLongestSubString(string));