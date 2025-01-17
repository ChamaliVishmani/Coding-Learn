const {createHash} = require('crypto');

// create string hash
function hash(input) {
    return createHash('sha256') // returns a 256-bit digest
        .update(input)
        .digest('hex') // output in hex/ base64
}

// compare two hashed passwords

let password = 'hi-mom!'
const hash1 = hash(password)
console.log(hash1)

// some time later...

password = 'hi-mom'
const hash2 = hash(password);
console.log(hash2)

const match = hash1 === hash2

console.log(match ? 'matching' : 'not matching')