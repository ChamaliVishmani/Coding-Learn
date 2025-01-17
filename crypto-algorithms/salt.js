const {scryptSync, randomBytes, timingSafeEqual} = require('crypto')

function signup(email,password){
    const salt = randomBytes(16).toString('hex');
    const hashedPassword = scryptSync(password,salt,64)

    const user = {email, password:`${salt}:${hashedPassword}`} // store salt with hash in the db

    return user;
}

function login(email,password){
    const user = users.find(v=> v.email===email)

    // get salt and hashedPassword from db
    const [salt,key] = user.password.split(':')
    const hashedBuffer = scryptSync(password,salt,64)

    // prevents timing attacks
    const keyBuffer = Buffer.from(key,'hex')
    const match = timingSafeEqual(hashedBuffer,keyBuffer)

    if(match){
        return 'login success'
    } else{
        return 'login fail'
    }
}