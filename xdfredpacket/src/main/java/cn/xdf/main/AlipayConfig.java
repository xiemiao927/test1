package cn.xdf.main;

public class AlipayConfig {
        // 商户的私钥,使用支付宝自带的openssl工具生成。
        public static String private_key="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQClFAonX76QBrQhmPN0eqbkioUgVvyYQcP0lc2ig82aIxxeCYO8mFlnkWmtgYgKy7EetOhKz2kI9qvDF8bf1mg6xagVuxr5WqOo3Xbm5UuaBGcUpY0fBp7uGJeojT1HT0RBjj8NWQ7PfxPMn3E/RLIL5NdO3A/OepnOj8bCkzMeHFd/Oh7Uj2xB0nhiSeAoSXRljUV1SBENC/4gPb+R8EX3qr9Hjt2XD3Vhg3v5yYJGubGOKJimVaZLG1/FQmC4/RXNjqJ5tK+SsfTwQ1CFwhzb0ZWou+3BcJRzOuh5NAlKfnag/gXoTPGoL8+6JFPE68WKrtZGlHantG+yqMC8bgZXAgMBAAECggEAEof+X88quEZYYFEoO1ItfAhky22Ya4sucT2D2ROMuBnq7E+LH1fG6Y50W4rn97ZICtdqIEPKWbw/KeZ4Z9ZM2xQnO1FGxOk86A78cw0YgJCv9axj/DClFLtkAwLf9ypZ0jYis9/kfryYP2dCskSG7DjjRrIDgD1ZGMwhFuSpX17Gyq1UGBCaeAAXkiwwr9tKwrDnjjFQY+e2ZzWtEADogvflqxMaecsJFX7lyyt6IgYeBklcOEU0eKs+dYQjuh+MztOfkWnq9hIZt+94ApabHst8uB2kgUcVJQq+rN4/mM8XUxPWb/NUqpNtu+53UuE9dlI/ALt/1CBQaYLx7cBwaQKBgQDgae1zxMT8vC6fXFAtnIRtzPlkpjw+xyMgkffD9Hh4ynZxIvqRbuAH4eFfk6lQx5XGiVNzT7taQGd9aeXXJaiwRwG5N0xjjyJEb5tWoZGjtQUk0dEeMBejC6VqB3qcbu4dwnLPTgl+U37xAPYNPC4G2BLQJE29Ejen86YqiqVquwKBgQC8UCL9V6gbgGantQL1UcOcx5CiK9Gn2SGbuRIXZOOwOt1/+Q5zKvODDdkvJuzkcGmdRM99vCjnPWlYU4vRWiYehusOu/hybhJ2kI1BDH9VOjGuenv/CIpxsjEvQpyzoeGyiOc7nuZHLUwxLeHaVsDdXnI4w5OkIJmbqieGi+T/FQKBgQCtHKmCg4idmaCxZ+mltbZmaRb9MEsK9ly/lDo3nA+OxkelsKDvrUL+cZ2EOAkFemCsXWTVb+0LiuEKWrVlSPSevreyo9i2eESr3BhNNKd/THWiWIRjMCAbszEv4IMRx3TB2izsg7tJCqnCycYEoaazutyQWWDqd/IdChPlfzxpXwKBgD9wR7lNFGbfZLXOtwZp2xov6LuZQ3HmJfpN6JhU9pdh3UjFYGbP62UU/ztxQ5DZhdrjWXskLitodtq4mnuWgQz7qqg2DsaN6k5i+BMX4LWXezEqNid+exU+UG95Y0zolh4NHMjrCOylh+txZ4qkeyiYLqaMzGoYSWc1dUdQTX7ZAoGBAJPLBQoz9Prch7Kj4vda7fzNWd/IkYQkHcSg/1pno5JNyGqwwbssn5b7HPfBiZwdD0gTFrvzuceX7lYpZf4nYYJ6yfY1yp7pbZT0CLGkFinR0H6cEZo8UkEBID+XuqnAy2BRxzgPzveks07BFZE1C7Y8kqnBPn/+75o+VkVr81ds";
        // 支付宝的公钥，
        public static String ali_public_key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhtsgIeeQg50bBenTZ2CNAohzrBO77m8ern5UGtAgHXVRi49W4PbL/gvdb7qLeznXCFhaFnidPIBnHF9MPhfq19QqYNregCBIJ7RehmoL93xjJQoYfAQ314I4n1D3lCACbtrlhtE/M2kKM1LPL3ZyYEjk11rqtD6ZFsuA2SrbKts1iH1fH9wjKdJOFOWWBwwe0oOws5HaqEr8jRqcGXjDcJJ6VR/LXBbvePCcnkPV02tNnjLTClxwrbxXJsO1w88D0Mg7YICQJLpTfIT0/iTrCcurubgEJUGbxkh8AT3CoqcCD2PaH+tkAccxtDodBUdXAYd8iVgcHxMr+IkD1dzc6wIDAQAB";
        // 接收通知的接口名(这里的域名或者ip需要填写外网可以访问的地址)
        public static String service = "https://www.dq-city.com/aliPay/api/callBack";
        //APPID
        public static String app_id="2018121862625030";
}