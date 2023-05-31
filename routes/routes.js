import { Router } from "express";
const rute = Router();

/** import all controllers */
import * as controller from '../controllers/controller.js';
import { registerMail } from '../controllers/mail.js'
import Auth, { localVariables } from '../middleware/auth.js';



/** POST Methods */
rute.route('/register').post(controller.register); // register user
rute.route('/registerMail').post(registerMail); // send the email
rute.route('/authenticate').post(controller.verifyUser, (req, res) => res.end()); // authenticate user
rute.route('/login').post(controller.verifyUser,controller.login); // login in app

/** GET Methods */
rute.route('/user/:username').get(controller.getUser) // user with username
rute.route('/generateOTP').get(controller.verifyUser, localVariables, controller.generateOTP) // generate random OTP
rute.route('/verifyOTP').get(controller.verifyUser, controller.verifyOTP) // verify generated OTP
rute.route('/createResetSession').get(controller.createResetSession) // reset all the variables


/** PUT Methods */
rute.route('/updateuser').put(Auth, controller.updateUser); // is use to update the user profile
rute.route('/resetPassword').put(controller.verifyUser, controller.resetPassword); // use to reset password



export default rute;