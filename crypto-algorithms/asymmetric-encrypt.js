const {publicEncrypt,privateDecrypt} = require('crypto')
const {privateKey,publicKey} = require('./keypair')

const message = 'the british are coming!'

// encrypt using public key

const encryptedData = publicEncrypt(
    publicKey,
    Buffer.from(message)
)

console.log(encryptedData.toString('hex'))

// decrypt using private key

const decryptedData = privateDecrypt(
    privateKey,
    encryptedData
)

console.log(decryptedData.toString('utf-8'))