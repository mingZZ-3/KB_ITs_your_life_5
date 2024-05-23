// router기반으로 코드를 모듈화하는 밥법
const express = require("express");
const router = express.Router();
const asyncHandler = require('express-async-handler');  
const bcrypt = require("bcrypt");


router.get('/get_page', (req, res) => {
    res.status(200).render('get_page');
});

// express-async-handler 기반으로 비동기 처리하는 방법
const registerMember = asyncHandler(async (req, res) => {
    console.log(req.query);
    let member = req.query;

    // pw 암호화
    const hashedPassword = await bcrypt.hash(member.pw, 11);
    member.pw = hashedPassword;

    res.render('result.ejs', {member})
    // res.json(member);
});

router.route('/get_result').get(registerMember);

module.exports = router;