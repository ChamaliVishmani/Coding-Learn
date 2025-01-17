const {createHmac} = require('crypto')

const sharedKey = 'super-secret!'
const messageToEncrypt = 'boo'

const hmac = createHmac('sha256',sharedKey) // uses key also to create hash
    .update(messageToEncrypt)
    .digest('hex')

console.log(hmac)

const sharedKey2 = 'another-key'
const hmac2 = createHmac('sha256',sharedKey2)
    .update(messageToEncrypt)
    .digest('hex')

console.log(hmac2) // different key, same message -> different hmac