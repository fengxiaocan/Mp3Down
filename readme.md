##某狗根据hash值获取歌曲信息的接口</p>
http://media.store.kugou.com/v1/get_res_privilege</p>
* QueryData  {"relate":1,"userid":0,"token":"","behavior":"download","clientver":"8983","appid":1005,"area_code":"1","resource":[{"id":0,"type":"audio","hash":"5c5058a06a632b65f1a3347bd4cd9a99","name":"TFBOYS - 大梦想家","album_id":""}],"vip":0}
* User-Agent: Android711-AndroidPhone-8983-15-0-mediastore-wifi
* Content-Type: application/x-www-form-urlencoded; charset=UTF-8
* Host: media.store.kugou.com
* data-binary '{"relate":1,"userid":0,"token":"","behavior":"download","clientver":"8983","appid":1005,"area_code":"1","resource":[{"id":0,"type":"audio","hash":"5c5058a06a632b65f1a3347bd4cd9a99","name":"","album_id":""}],"vip":0}
* 请求时把hash更改即可,name不填
* 以下为返回数据

        {
        	"data": [
        		{
        			"_errno": 5,
        			"_msg": "Deny: the audio need to buy.",
        			"album_audio_id": 31832862,
        			"album_id": "0",
        			"buy_count": 703321,
        			"cid": 5803009,
        			"discount": [
        			],
        			"end_time": "0000-00-00",
        			"exclusive_end_time": "0000-00-00",
        			"exclusive_start_time": "0000-00-00",
        			"exclusive_status": 1,
        			"expire": 0,
        			"fail_process": 4,
        			"hash": "5C5058A06A632B65F1A3347BD4CD9A99",
        			"id": 16537136,
        			"info": {
        				"bitrate": 128,
        				"duration": 226000,
        				"extname": "mp3",
        				"filesize": 3615480,
        				"flag": 100,
        				"image": "",
        				"intro": ""
        			},
        			"is_search_top": 0,
        			"level": 2,
        			"name": "TFBOYS - 大梦想家",
        			"old_cpy": 1,
        			"old_hide": 1,
        			"pay_block_text": "0",
        			"pay_type": 3,
        			"pkg_price": 1,
        			"price": 200,
        			"privilege": 8,
        			"publish": 1,
        			"rebuy_pay_type": 0,
        			"recommend_album_id": "939337",
        			"relate_goods": [
        				{
        					"_errno": 5,
        					"_msg": "Deny: the audio need to buy.",
        					"_not_trust": false,
        					"album_audio_id": 31832862,
        					"album_id": "939337",
        					"buy_count": 703321,
        					"cid": 5803009,
        					"discount": [
        					],
        					"end_time": "0000-00-00",
        					"exclusive_end_time": "0000-00-00",
        					"exclusive_start_time": "0000-00-00",
        					"exclusive_status": 1,
        					"expire": 0,
        					"fail_process": 4,
        					"hash": "3A3E3951E3AB18BBCC9D10854E726B03",
        					"id": 16537136,
        					"info": {
        						"bitrate": 320,
        						"duration": 226000,
        						"extname": "mp3",
        						"filesize": 9041636,
        						"flag": 100,
        						"image": "",
        						"intro": ""
        					},
        					"is_search_top": 0,
        					"level": 4,
        					"name": "TFBOYS - 大梦想家",
        					"old_cpy": 1,
        					"old_hide": 1,
        					"pay_block_text": "0",
        					"pay_type": 3,
        					"pkg_price": 1,
        					"price": 200,
        					"privilege": 10,
        					"publish": 1,
        					"rebuy_pay_type": 0,
        					"singername": "TFBOYS",
        					"start_time": "0000-00-00",
        					"status": 0,
        					"topic_remark": "",
        					"topic_url": "",
        					"trans_param": {
        						"musicpack_advance": 0
        					},
        					"type": "audio"
        				},
        				{
        					"_errno": 5,
        					"_msg": "Deny: the audio need to buy.",
        					"_not_trust": false,
        					"album_audio_id": 31832862,
        					"album_id": "939337",
        					"buy_count": 703321,
        					"cid": 5803009,
        					"discount": [
        					],
        					"end_time": "0000-00-00",
        					"exclusive_end_time": "0000-00-00",
        					"exclusive_start_time": "0000-00-00",
        					"exclusive_status": 1,
        					"expire": 0,
        					"fail_process": 4,
        					"hash": "5C5058A06A632B65F1A3347BD4CD9A99",
        					"id": 16537136,
        					"info": {
        						"bitrate": 128,
        						"duration": 226000,
        						"extname": "mp3",
        						"filesize": 3615480,
        						"flag": 100,
        						"image": "",
        						"intro": ""
        					},
        					"is_search_top": 0,
        					"level": 2,
        					"name": "TFBOYS - 大梦想家",
        					"old_cpy": 1,
        					"old_hide": 1,
        					"pay_block_text": "0",
        					"pay_type": 3,
        					"pkg_price": 1,
        					"price": 200,
        					"privilege": 8,
        					"publish": 1,
        					"rebuy_pay_type": 0,
        					"singername": "TFBOYS",
        					"start_time": "0000-00-00",
        					"status": 0,
        					"topic_remark": "",
        					"topic_url": "",
        					"trans_param": {
        						"musicpack_advance": 0
        					},
        					"type": "audio"
        				},
        				{
        					"_errno": 5,
        					"_msg": "Deny: the audio need to buy.",
        					"_not_trust": false,
        					"album_audio_id": 31832862,
        					"album_id": "939337",
        					"buy_count": 703321,
        					"cid": 5803009,
        					"discount": [
        					],
        					"end_time": "0000-00-00",
        					"exclusive_end_time": "0000-00-00",
        					"exclusive_start_time": "0000-00-00",
        					"exclusive_status": 1,
        					"expire": 0,
        					"fail_process": 4,
        					"hash": "B9EE2BEA02E2DFFFE36C7F00FEB9AC8C",
        					"id": 16537136,
        					"info": {
        						"bitrate": 1075,
        						"duration": 225000,
        						"extname": "flac",
        						"filesize": 30367790,
        						"flag": 100,
        						"image": "",
        						"intro": ""
        					},
        					"is_search_top": 0,
        					"level": 5,
        					"name": "TFBOYS - 大梦想家",
        					"old_cpy": 1,
        					"old_hide": 1,
        					"pay_block_text": "0",
        					"pay_type": 3,
        					"pkg_price": 1,
        					"price": 200,
        					"privilege": 10,
        					"publish": 1,
        					"rebuy_pay_type": 0,
        					"singername": "TFBOYS",
        					"start_time": "0000-00-00",
        					"status": 0,
        					"topic_remark": "",
        					"topic_url": "",
        					"trans_param": {
        						"musicpack_advance": 0
        					},
        					"type": "audio"
        				}
        			],
        			"singername": "TFBOYS",
        			"start_time": "0000-00-00",
        			"status": 0,
        			"topic_remark": "",
        			"topic_url": "",
        			"trans_param": {
        				"musicpack_advance": 0
        			},
        			"type": "audio"
        		}
        	],
        	"error_code": 0,
        	"message": "",
        	"status": 1
        }

##某狗下载地址
* 根据上面的获取到音频id来下载
* http://trackercdngz.kugou.com/i/v2/?album_audio_id=16537136&behavior=play&module=&cmd=26&token=62fe339110743cfb7903be6aa97163dd1a6b787c710190c618adf52395f024d9&album_id=2952169&hash=db723af325cc1bdb39c8ff177c45443b&userid=1009223334&pid=2&vipType=0&version=8983&area_code=1&appid=1005&mid=127863426975423181036743697085296207469&key=646a1a3f75b24e21b799a17e9a98ed09&pidversion=3001&with_res_tag=1
* 把album_audio_id=更改为获取到的id即可
* 以下是获取到的数据:

        {
          "status" : 1,
          "timeLength" : 172,
          "fileName" : "7BDF85F5A0E8005FBA735F0BAC5E5778 - 140071584876288.fla",
          "bitRate" : 128000,
          "q" : 0,
          "fileHead" : 100,
          "extName" : "mp3",
          "fileSize" : 2748626,
          "url" : [
            "http:\/\/fs.android2.kugou.com\/ab9cd4b65f84cd5aaa22964c6249fd63\/5b209a25\/G109\/M08\/11\/05\/rQ0DAFmFw8aAHidgACnw0pPZWK4975.mp3",
            "http:\/\/fs.mobile.kugou.com\/201806131214\/6feeca7b8ad50a19adf0293aa8925c49\/G109\/M08\/11\/05\/rQ0DAFmFw8aAHidgACnw0pPZWK4975.mp3"
          ]
        }
        
* http://fs.android2.kugou.com//db60a0873a31ef76a05023c4f5be550d//5b20954d//G109//M08//11//05//rQ0DAFmFw8aAHidgACnw0pPZWK4975.mp3为下载地址

##某狗搜索地址
* http://mobilecdngz.kugou.com/api/v3/search/song?showtype=14&highlight=em&pagesize=30&tag_aggr=1&tagtype=8&plat=0&sver=5&keyword=%E5%B0%B1%E6%98%AF%E7%88%B1%E4%BD%A0&correct=1&api_ver=1&version=8983&page=1&area_code=1&tag=1&with_res_tag=1  
* 获取到的数据
        <!--KG_TAG_RES_START-->{"error":"","data":{"aggregation":[{"key":"DJ","count":19},{"key":"现场","count":19},{"key":"广场舞","count":0},{"key":"伴奏","count":46},{"key":"铃声","count":0}],"tab":"全部","info":[{"othername_original":"","pay_type_320":3,"m4afilesize":1069559,"price_sq":200,"isoriginal":1,"filesize":4193911,"source":"","bitrate":128,"topic":"","price":200,"Accompany":1,"old_cpy":0,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":101834667,"hash":"a2f12fe24d38e7a7fe60e2fb842c8e44","mvhash":"6640a4117197d8885eafb550f832ce0d","album_name":"太平盛世","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"7547427","ownercount":232536,"fold_type":0,"pkg_price_sq":1,"sqhash":"1319af1dda3d21ab2bd1416c63ef86fb","320filesize":10567463,"rp_publish":1,"duration":262,"extname":"mp3","320hash":"2023de2eea585fb09b402f0819bc78eb","fail_process_sq":4,"sqfilesize":30153349,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":3,"audio_id":286955,"sqprivilege":10,"group":[],"othername":""},{"othername_original":"Live","pay_type_320":0,"m4afilesize":1429653,"price_sq":0,"isoriginal":0,"filesize":5490786,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","album_audio_id":33146604,"hash":"db660b9add9d6913f7ac53b48d0c0a99","mvhash":"","album_name":"1.2.3我们都是木头人 世界巡回演唱会","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"1077606","ownercount":7666,"fold_type":1,"pkg_price_sq":0,"sqhash":"","320filesize":13627747,"rp_publish":1,"duration":340,"extname":"mp3","320hash":"84893e3dfd0d9dcbb32d10ac4c36d979","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":286960,"sqprivilege":0,"group":[{"othername_original":"Live","pay_type_320":0,"m4afilesize":1784680,"price_sq":0,"isoriginal":0,"filesize":6967450,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","hash":"e00489dc498733402523f16f3ebb0e6b","mvhash":"","album_audio_id":66089650,"privilege":0,"album_name":"Live Again: 陶喆 小人物狂想曲 现场专辑","audio_id":27066175,"album_id":"2716374","ownercount":76,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":17418108,"rp_publish":1,"duration":435,"sqhash":"30f633b2ad597c56d1972593f8924936","extname":"mp3","320hash":"41f6f7153121a9ac38e7ed6f113662a1","sqfilesize":50146051,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""}],"othername":""},{"othername_original":"粤语版","pay_type_320":0,"m4afilesize":984836,"price_sq":0,"isoriginal":0,"filesize":3834498,"source":"","bitrate":128,"topic":"原曲 : 陶喆 - 就是爱你","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"阿细","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"阿细 - <em>就是爱你<\/em> (粤语版)","price_320":0,"songname":"<em>就是爱你<\/em> (粤语版)","album_audio_id":106472116,"hash":"a99b320c0acadfed0593fd21f6c9488d","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":7410,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":239,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":37177317,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":1148426,"price_sq":0,"isoriginal":0,"filesize":4490327,"source":"","bitrate":128,"topic":"","price":200,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"赵雪","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"赵雪 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":30307450,"hash":"08aaa2c1748d9e3276c075c9b0654212","mvhash":"","album_name":"陶醉","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"768749","ownercount":3534,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":11225530,"rp_publish":1,"duration":281,"extname":"mp3","320hash":"55cdf4c7743d8c36fa5390c278d704c7","fail_process_sq":0,"sqfilesize":0,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":0,"audio_id":99498,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"Live","pay_type_320":0,"m4afilesize":695586,"price_sq":0,"isoriginal":0,"filesize":2707367,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"金雯昕","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"金雯昕 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","album_audio_id":39691609,"hash":"0665d61d17b29bb87a2464f236980ddf","mvhash":"","album_name":"2016超级女声总决赛第二场","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"1747165","ownercount":3264,"fold_type":1,"pkg_price_sq":0,"sqhash":"f4a60a3b33bde730a1acd42321b91bdd","320filesize":6768167,"rp_publish":1,"duration":169,"extname":"mp3","320hash":"55948875eabc9ce2184fcaed04d025c2","fail_process_sq":0,"sqfilesize":18391837,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":22385465,"sqprivilege":0,"group":[{"othername_original":"Live","pay_type_320":0,"m4afilesize":695586,"price_sq":0,"isoriginal":0,"filesize":2707367,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"金雯昕","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"金雯昕 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","hash":"0665d61d17b29bb87a2464f236980ddf","mvhash":"","album_audio_id":64278563,"privilege":0,"album_name":"芒果TV《超级女声》总决赛第二场选手演唱曲目","audio_id":22385465,"album_id":"2599431","ownercount":2,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":6768167,"rp_publish":1,"duration":169,"sqhash":"f4a60a3b33bde730a1acd42321b91bdd","extname":"mp3","320hash":"55948875eabc9ce2184fcaed04d025c2","sqfilesize":18391837,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""}],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":1063703,"price_sq":0,"isoriginal":0,"filesize":4164333,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"程嘉敏","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"程嘉敏 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":107109233,"hash":"034ac37eba5fd8d9f87b8d5fce8b0a45","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":1300,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":260,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":37662657,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":214995,"price_sq":0,"isoriginal":0,"filesize":824000,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"夏磊(2)","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"夏磊(2) - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":106529788,"hash":"eac93a66b30ee690e6c42c74a339c2f7","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":1136,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":51,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":37242861,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":1051418,"price_sq":0,"isoriginal":0,"filesize":4123004,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"梁一贞","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"梁一贞 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":32119006,"hash":"b019a6e0f886ef3c4b3cbf515582cda5","mvhash":"55bd1db350b2cabe0089b86a639424c7","album_name":"就是爱你","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"968894","ownercount":729,"fold_type":0,"pkg_price_sq":0,"sqhash":"3159fa8af17e3fe1a9b05793e492beea","320filesize":10348780,"rp_publish":1,"duration":257,"extname":"mp3","320hash":"137e6c76abaeb129aade566409d28cd1","fail_process_sq":0,"sqfilesize":29772669,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":51049,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"节目","pay_type_320":0,"m4afilesize":1069312,"price_sq":0,"isoriginal":0,"filesize":4197348,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"DJ程一","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"DJ程一 - <em>就是爱你<\/em> (节目)","price_320":0,"songname":"<em>就是爱你<\/em> (节目)","album_audio_id":104342471,"hash":"a3998011133062f4ecbb55072a2fc476","mvhash":"","album_name":"程一电台","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"8090766","ownercount":592,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":262,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":35355475,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"Live","pay_type_320":0,"m4afilesize":1107930,"price_sq":0,"isoriginal":0,"filesize":4186020,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"魏晨","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"魏晨 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","album_audio_id":33145330,"hash":"bc94a747171f16f4ec081395d9f4d454","mvhash":"","album_name":"快乐男声魏晨歌曲","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"1077483","ownercount":260,"fold_type":1,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":261,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":289318,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":2165186,"price_sq":0,"isoriginal":0,"filesize":8451969,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"金曲串烧：十年+我们的爱+<em>就是爱你<\/em>+小情歌+改变自己+洋葱+没那么简单+那些年+我的歌声里+爸爸去哪儿","singername":"胡夏","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"胡夏 - 金曲串烧：十年+我们的爱+<em>就是爱你<\/em>+小情歌+改变自己+洋葱+没那么简单+那些年+我的歌声里+爸爸去哪儿","price_320":0,"songname":"金曲串烧：十年+我们的爱+<em>就是爱你<\/em>+小情歌+改变自己+洋葱+没那么简单+那些年+我的歌声里+爸爸去哪儿","album_audio_id":27708923,"hash":"5e859ab7e99e20d7f76545b2541fd70f","mvhash":"4167924d7e11b66cf0cde974c9eb7e8e","album_name":"酷狗音乐盛典十年金曲串烧","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"537596","ownercount":1242,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":21128881,"rp_publish":1,"duration":528,"extname":"mp3","320hash":"9f2f7e74f6850967f153b938ca7c438a","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":3958963,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"KTV版伴奏","pay_type_320":0,"m4afilesize":1086401,"price_sq":0,"isoriginal":0,"filesize":4134477,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (KTV版伴奏)","price_320":0,"songname":"<em>就是爱你<\/em> (KTV版伴奏)","album_audio_id":40470883,"hash":"72ce5e0065befea6dc9038f7c67941b7","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":559,"fold_type":1,"pkg_price_sq":0,"sqhash":"","320filesize":10443799,"rp_publish":1,"duration":258,"extname":"mp3","320hash":"a8a490b880654d1e5fa3309270eb362d","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":286988,"sqprivilege":0,"group":[{"othername_original":"升调版伴奏","pay_type_320":0,"m4afilesize":1061932,"price_sq":0,"isoriginal":0,"filesize":4133659,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (升调版伴奏)","price_320":0,"songname":"<em>就是爱你<\/em> (升调版伴奏)","hash":"7e4ad462cbeb5330f9e063da376cda6d","mvhash":"","album_audio_id":47604161,"privilege":0,"album_name":"","audio_id":16399121,"album_id":"","ownercount":31,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":0,"rp_publish":1,"duration":258,"sqhash":"","extname":"mp3","320hash":"","sqfilesize":0,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""},{"othername_original":"降调版伴奏","pay_type_320":0,"m4afilesize":1087275,"price_sq":0,"isoriginal":0,"filesize":4138632,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (降调版伴奏)","price_320":0,"songname":"<em>就是爱你<\/em> (降调版伴奏)","hash":"0f38a645bbfa36d0ee0164a50de4772a","mvhash":"","album_audio_id":42128557,"privilege":0,"album_name":"","audio_id":3924953,"album_id":"","ownercount":24,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":0,"rp_publish":1,"duration":258,"sqhash":"","extname":"mp3","320hash":"","sqfilesize":0,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""}],"othername":""},{"othername_original":"live","pay_type_320":0,"m4afilesize":65840,"price_sq":0,"isoriginal":0,"filesize":241637,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"西柚","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"西柚 - <em>就是爱你<\/em> (live)","price_320":0,"songname":"<em>就是爱你<\/em> (live)","album_audio_id":107534716,"hash":"22004fc7467521f389c3e46f5d5205c7","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":440,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":15,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":37975612,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":904258,"price_sq":200,"isoriginal":0,"filesize":3522011,"source":"","bitrate":128,"topic":"","price":200,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"代理仁","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"代理仁 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":57255201,"hash":"0c575ea0130e9ca6d2e0eb3896ba20d7","mvhash":"","album_name":"就是爱你","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"2111909","ownercount":197,"fold_type":0,"pkg_price_sq":1,"sqhash":"414cb3625dc6bbcdeb3609f8b4cdf436","320filesize":8806400,"rp_publish":1,"duration":220,"extname":"mp3","320hash":"d7dd560e71e1e6c04b8bd6ecc04fab30","fail_process_sq":4,"sqfilesize":24857874,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":3,"audio_id":26394052,"sqprivilege":10,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":1085706,"price_sq":0,"isoriginal":0,"filesize":4132746,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"张远","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"张远 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":40454522,"hash":"e7e174bec9460fdcd8d00eea143ffd8b","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":146,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":258,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":211891,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"DJ版","pay_type_320":0,"m4afilesize":1338328,"price_sq":0,"isoriginal":0,"filesize":5136301,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"小洲","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"小洲 - <em>就是爱你<\/em> (DJ版)","price_320":0,"songname":"<em>就是爱你<\/em> (DJ版)","album_audio_id":28277229,"hash":"3656fb59760aeb673f30ee663184c521","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":121,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":321,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":2819618,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"Live","pay_type_320":0,"m4afilesize":920585,"price_sq":0,"isoriginal":0,"filesize":3502833,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"周笔畅","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"周笔畅 - <em>就是爱你<\/em> (Live)","price_320":0,"songname":"<em>就是爱你<\/em> (Live)","album_audio_id":27160449,"hash":"1a334b7f76e6d337db85c60aeecaca95","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":90,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":218,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":36830,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":899697,"price_sq":0,"isoriginal":0,"filesize":3525641,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"王艺函","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"王艺函 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":56969113,"hash":"f5cd0b0b39b10db7c53d8646b8b788d7","mvhash":"","album_name":"守候和你的回忆","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"2084450","ownercount":89,"fold_type":0,"pkg_price_sq":0,"sqhash":"73e228b13536e171c20b818b5b9aee11","320filesize":8692225,"rp_publish":1,"duration":220,"extname":"mp3","320hash":"aa60d181c214afb5275d21641abcfffe","fail_process_sq":0,"sqfilesize":28673781,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":3833774,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"剧场版","pay_type_320":0,"m4afilesize":2158483,"price_sq":0,"isoriginal":0,"filesize":8432077,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (剧场版)","price_320":0,"songname":"<em>就是爱你<\/em> (剧场版)","album_audio_id":41390384,"hash":"b7a671bab7a57bdc2fa887b5dd0b904e","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":77,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":527,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":2781095,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":840653,"price_sq":200,"isoriginal":0,"filesize":3298729,"source":"","bitrate":128,"topic":"译名 : <em>就是爱你<\/em>","price":200,"Accompany":1,"old_cpy":1,"songname_original":"Got 2 Luv U","singername":"Sean Paul、Alexis Jordan","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"Sean Paul、Alexis Jordan - Got 2 Luv U","price_320":200,"songname":"Got 2 Luv U","album_audio_id":40069463,"hash":"9366ac2411cac01084f3feb72337d83b","mvhash":"a35a0c922a54bcc0e21c013c2e3187ab","album_name":"Got 2 Luv U","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"1795809","ownercount":70,"fold_type":0,"pkg_price_sq":1,"sqhash":"f4adca9dde59519e96f793775f698846","320filesize":8336445,"rp_publish":1,"duration":206,"extname":"mp3","320hash":"44301e6e63e5a3e075cdd6b33e0b2577","fail_process_sq":4,"sqfilesize":25930062,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":3,"audio_id":791852,"sqprivilege":10,"group":[{"othername_original":"","pay_type_320":3,"m4afilesize":840653,"price_sq":200,"isoriginal":0,"filesize":3298729,"source":"","bitrate":128,"topic":"译名 : <em>就是爱你<\/em>","price":200,"Accompany":1,"old_cpy":1,"songname_original":"Got 2 Luv U","singername":"Sean Paul、Alexis Jordan","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"Sean Paul、Alexis Jordan - Got 2 Luv U","price_320":200,"songname":"Got 2 Luv U","hash":"9366ac2411cac01084f3feb72337d83b","mvhash":"a35a0c922a54bcc0e21c013c2e3187ab","album_audio_id":64457696,"privilege":8,"album_name":"Strictly The Best Vol. 45","audio_id":791852,"album_id":"1582624","ownercount":0,"fold_type":0,"320privilege":10,"isnew":0,"320filesize":8336445,"rp_publish":1,"duration":206,"sqhash":"f4adca9dde59519e96f793775f698846","extname":"mp3","320hash":"44301e6e63e5a3e075cdd6b33e0b2577","sqfilesize":25930062,"fail_process":4,"fail_process_sq":4,"srctype":1,"pkg_price_320":1,"pay_type_sq":3,"pkg_price_sq":1,"sqprivilege":10,"fail_process_320":4,"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":840653,"price_sq":200,"isoriginal":0,"filesize":3298729,"source":"","bitrate":128,"topic":"译名 : <em>就是爱你<\/em>","price":200,"Accompany":1,"old_cpy":1,"songname_original":"Got 2 Luv U","singername":"Sean Paul","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"Sean Paul - Got 2 Luv U","price_320":200,"songname":"Got 2 Luv U","hash":"9366ac2411cac01084f3feb72337d83b","mvhash":"a35a0c922a54bcc0e21c013c2e3187ab","album_audio_id":64466830,"privilege":8,"album_name":"Tomahawk Technique","audio_id":791852,"album_id":"983121","ownercount":0,"fold_type":0,"320privilege":10,"isnew":0,"320filesize":8336445,"rp_publish":1,"duration":206,"sqhash":"f4adca9dde59519e96f793775f698846","extname":"mp3","320hash":"44301e6e63e5a3e075cdd6b33e0b2577","sqfilesize":25930062,"fail_process":4,"fail_process_sq":4,"srctype":1,"pkg_price_320":1,"pay_type_sq":3,"pkg_price_sq":1,"sqprivilege":10,"fail_process_320":4,"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":840653,"price_sq":0,"isoriginal":0,"filesize":3298729,"source":"","bitrate":128,"topic":"译名 : <em>就是爱你<\/em>","price":0,"Accompany":1,"old_cpy":1,"songname_original":"Got 2 Luv U","singername":"Sean Paul、Alexis Jordan","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"Sean Paul、Alexis Jordan - Got 2 Luv U","price_320":0,"songname":"Got 2 Luv U","hash":"9366ac2411cac01084f3feb72337d83b","mvhash":"a35a0c922a54bcc0e21c013c2e3187ab","album_audio_id":40098290,"privilege":0,"album_name":"NOW That's What I Call Music! 80","audio_id":791852,"album_id":"1799936","ownercount":0,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":8336445,"rp_publish":1,"duration":206,"sqhash":"f4adca9dde59519e96f793775f698846","extname":"mp3","320hash":"44301e6e63e5a3e075cdd6b33e0b2577","sqfilesize":25930062,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":840653,"price_sq":0,"isoriginal":0,"filesize":3298729,"source":"","bitrate":128,"topic":"译名 : <em>就是爱你<\/em>","price":0,"Accompany":1,"old_cpy":1,"songname_original":"Got 2 Luv U","singername":"Alexis Jordan、Sean Paul","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"Alexis Jordan、Sean Paul - Got 2 Luv U","price_320":0,"songname":"Got 2 Luv U","hash":"9366ac2411cac01084f3feb72337d83b","mvhash":"a35a0c922a54bcc0e21c013c2e3187ab","album_audio_id":27921570,"privilege":0,"album_name":"音乐咖啡厅_2014","audio_id":791852,"album_id":"545759","ownercount":0,"fold_type":0,"320privilege":0,"isnew":0,"320filesize":8336445,"rp_publish":1,"duration":206,"sqhash":"f4adca9dde59519e96f793775f698846","extname":"mp3","320hash":"44301e6e63e5a3e075cdd6b33e0b2577","sqfilesize":25930062,"fail_process":0,"fail_process_sq":0,"srctype":1,"pkg_price_320":0,"pay_type_sq":0,"pkg_price_sq":0,"sqprivilege":0,"fail_process_320":0,"othername":""}],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":839085,"price_sq":0,"isoriginal":0,"filesize":3239809,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"花然","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"花然 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":106167293,"hash":"8d041416d7d1c4b998f204470f358f54","mvhash":"","album_name":"山楂树之恋","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"8337745","ownercount":67,"fold_type":0,"pkg_price_sq":0,"sqhash":"fde6bacfc7c4b7f8575af3d7e38267f6","320filesize":8099124,"rp_publish":1,"duration":202,"extname":"mp3","320hash":"fb83113cf18bc76faa1fb187b5d224e3","fail_process_sq":0,"sqfilesize":19623007,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":36806940,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":849801,"price_sq":0,"isoriginal":0,"filesize":3312526,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"ZERO-G","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"ZERO-G - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":54267187,"hash":"74b47ded674ab8171dc7485be12d17dc","mvhash":"","album_name":"告白","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"1983460","ownercount":52,"fold_type":0,"pkg_price_sq":0,"sqhash":"b63d5d2a45f69b03de3172d7b913a1ed","320filesize":8280920,"rp_publish":1,"duration":207,"extname":"mp3","320hash":"a595b8558c0abe1c322c03426c313abc","fail_process_sq":0,"sqfilesize":28288829,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":25755436,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":549191,"price_sq":0,"isoriginal":0,"filesize":2552095,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"儿童歌曲","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"儿童歌曲 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":54137632,"hash":"ca3f8d44699bda7ba37d01d512ead84e","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":42,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":171,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":3575406,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":893939,"price_sq":0,"isoriginal":0,"filesize":3474538,"source":"","bitrate":128,"topic":"","price":200,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"梦洛伊","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"梦洛伊 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":92198599,"hash":"328166f6a4fd8faf0d249e82c12d69a4","mvhash":"","album_name":"是我入戏太深","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"4664843","ownercount":41,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":8685236,"rp_publish":1,"duration":217,"extname":"mp3","320hash":"0192fb43be7a5b4beb5ebe9c14aa6e9b","fail_process_sq":0,"sqfilesize":0,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":0,"audio_id":28426071,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"DJ版","pay_type_320":0,"m4afilesize":829888,"price_sq":0,"isoriginal":0,"filesize":1625092,"source":"","bitrate":64,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - <em>就是爱你<\/em> (DJ版)","price_320":0,"songname":"<em>就是爱你<\/em> (DJ版)","album_audio_id":40478325,"hash":"3a27c58375d942a066acb78789ba9613","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":40,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":203,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":286965,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":1026376,"price_sq":200,"isoriginal":0,"filesize":4001741,"source":"","bitrate":128,"topic":"","price":200,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"薛冬梅","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"薛冬梅 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":104732576,"hash":"4714a0084a1a76667a0232e66ea94c72","mvhash":"","album_name":"深情相拥","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"8124000","ownercount":35,"fold_type":0,"pkg_price_sq":1,"sqhash":"bcbff80e7ffb6bcbe54ce6ab13f07479","320filesize":10004020,"rp_publish":1,"duration":250,"extname":"mp3","320hash":"4be55792b338f6a79d69f164d987c318","fail_process_sq":4,"sqfilesize":20648511,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":3,"audio_id":27478367,"sqprivilege":10,"group":[],"othername":""},{"othername_original":"Live","pay_type_320":0,"m4afilesize":1562950,"price_sq":0,"isoriginal":0,"filesize":5955810,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"小镇姑娘+普通朋友+<em>就是爱你<\/em>+susan说+爱,很简单+找自己","singername":"陶喆","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"陶喆 - 小镇姑娘+普通朋友+<em>就是爱你<\/em>+susan说+爱,很简单+找自己 (Live)","price_320":0,"songname":"小镇姑娘+普通朋友+<em>就是爱你<\/em>+susan说+爱,很简单+找自己 (Live)","album_audio_id":40288445,"hash":"e004c3e0b78f69a72710bbca2c22ce6a","mvhash":"","album_name":"湖南卫视2012跨年演唱会","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"511566","ownercount":32,"fold_type":1,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":372,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":964218,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"王子","pay_type_320":0,"m4afilesize":1081748,"price_sq":0,"isoriginal":0,"filesize":4212654,"source":"","bitrate":128,"topic":"","price":0,"Accompany":1,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"网络歌手","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"网络歌手 - <em>就是爱你<\/em> (王子)","price_320":0,"songname":"<em>就是爱你<\/em> (王子)","album_audio_id":66317655,"hash":"6df1c9a361ecdbcdcdb1c5ffa9b4adf0","mvhash":"","album_name":"","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"","ownercount":26,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":0,"rp_publish":1,"duration":263,"extname":"mp3","320hash":"","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":27175203,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":0,"m4afilesize":656240,"price_sq":0,"isoriginal":0,"filesize":2579008,"source":"","bitrate":128,"topic":"","price":0,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"阿怡","pay_type":0,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"阿怡 - <em>就是爱你<\/em>","price_320":0,"songname":"<em>就是爱你<\/em>","album_audio_id":106719462,"hash":"b970160274c5f41b389dd4ea7bc0bba8","mvhash":"","album_name":"像我这样的人","privilege":0,"fail_process_320":0,"320privilege":0,"album_id":"8429131","ownercount":23,"fold_type":0,"pkg_price_sq":0,"sqhash":"","320filesize":6447222,"rp_publish":1,"duration":161,"extname":"mp3","320hash":"3962be6417b070b535bd100920a96713","fail_process_sq":0,"sqfilesize":0,"fail_process":0,"srctype":1,"pkg_price_320":0,"isnew":0,"pay_type_sq":0,"audio_id":16734512,"sqprivilege":0,"group":[],"othername":""},{"othername_original":"","pay_type_320":3,"m4afilesize":921897,"price_sq":200,"isoriginal":0,"filesize":3628091,"source":"","bitrate":128,"topic":"","price":200,"Accompany":0,"old_cpy":1,"songname_original":"<em>就是爱你<\/em>","singername":"陈泳弘","pay_type":3,"sourceid":0,"topic_url":"","rp_type":"audio","pkg_price":1,"feetype":0,"filename":"陈泳弘 - <em>就是爱你<\/em>","price_320":200,"songname":"<em>就是爱你<\/em>","album_audio_id":35253699,"hash":"dcea9659d8a3b08777773bdd56b8cff2","mvhash":"","album_name":"用心吻走你的伤痛","privilege":8,"fail_process_320":4,"320privilege":10,"album_id":"1243935","ownercount":23,"fold_type":0,"pkg_price_sq":1,"sqhash":"0c3a9ccb65acdb592e4e6c28d402ac72","320filesize":9069920,"rp_publish":1,"duration":227,"extname":"mp3","320hash":"50348d78877bdbf6951fbf0a5a4b5127","fail_process_sq":4,"sqfilesize":13795912,"fail_process":4,"srctype":1,"pkg_price_320":1,"isnew":0,"pay_type_sq":3,"audio_id":20564179,"sqprivilege":10,"group":[],"othername":""}],"correctiontype":0,"timestamp":1528868229,"allowerr":0,"total":337,"istag":0,"istagresult":0,"forcecorrection":0,"correctiontip":""},"errcode":0,"status":1,"relative":{"priortype":1,"singer":null},"black":{"isblock":1,"type":0},"correct":null}<!--KG_TAG_RES_END-->