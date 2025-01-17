const {generateKeyPairSync} = require('crypto')

const {privateKey,publicKey}= generateKeyPairSync(
    'rsa' , // rsa - rivest-shamir-adleman
    {
    modulusLength:2048 , // length of key in bits
    publicKeyEncoding:{
        type:'spki',// recommended by Node.js docs
        format:'pem' // pem = privacy enhanced mail - show keys in base64 format
    },
    privateKeyEncoding:{
        type:'pkcs8', // recommended by Node.js docs
        format:'pem',
        // cipher:'aes-256-cbc',
        // passphrase:'top-secret' // can add for added security
    }
})

console.log(publicKey)
console.log(privateKey)

module.exports={
    privateKey,publicKey
}