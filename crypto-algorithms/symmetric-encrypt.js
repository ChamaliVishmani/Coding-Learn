const {createCipheriv, randomBytes,createDecipheriv} = require('crypto')

// cipher

const message = 'i like turtles'
const key = randomBytes(32)
const iv = randomBytes(16) //iv = initialization vector - prevent identical sequences of text

const cipher = createCipheriv('aes256',key,iv)//aes = advanced encryption standard

// encrypt

const encryptedMessage = cipher.update(message,'utf-8','hex') + cipher.final('hex')

// decipher

const decipher = createDecipheriv('aes256',key,iv)

const decryptedMessage = decipher.update(encryptedMessage,'hex','utf-8') + decipher.final('utf-8')

console.log(`message : ${message} 
encryptedMessage : ${encryptedMessage}  
decryptedMessage : ${decryptedMessage}`)