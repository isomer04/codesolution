function isPangram(pangram) {
    // Write your code here
    
    let output = [];
    
    for(let i=0; i< pangram.length; i++) {
        let isPanagram = true;
        let alpha = 'qwertyuiopasdfghjklzxcvbnm';
        
        for(let j = 0 ; j< alpha.length; j++) {
            if(!pangram[i].includes(alpha[j])) {
                isPanagram = false;
                break;
            }
        }
        
        output.push(isPanagram ? '1' : '0');

    }
    
    return output.join('');
    

}
