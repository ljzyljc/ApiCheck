package com.jackie.createapidemo;

/**yb
 * @api {get} /session-v2 获取用户信息
 * @apiVersion 1.0.10
 * @apiName TestA
 * @apiGroup Company
 *
 * @apiParam {Long} messageNameAbbbccccdddddddeeefffgggg Users unique ID.
 *
 * @apiSuccess {String} date DateA of birth of the User.
 * @apiSuccess {String} name NameA of the User.
 */
public class TestA {
    /**
     * this is comment
     */
    private int birthday;

    private String name;
}
