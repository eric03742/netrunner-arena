(ns nr.landing)

(def landing-content
  [:div.landing.panel.content-page.blue-shade
;;    [:h2 "Welcome!"]
;;    [:p "This website is for the facilitation of Netrunner games online. Please note that jinteki.net does not provide a complete implementation of the " [:u "rules"] " of the game."]
;;    [:h4 "Making Jinteki.net better:"]
;;    [:p "Jinteki.net is the product of voluntary contributions made by many individuals. If you wish to make Jinteki.net better, found a bug and need to report an issue, or just like reading code, simply visit " [:a {:href "https://github.com/mtgred/netrunner" :target "_blank"} "our github page."]]
;;    [:h4 "The use of Jinteki.net:"]
;;    [:ul.list.compact
;;     [:li "Please be respectful. Any disrespectful conduct will not be tolerated regardless of the circumstance or rationale."]
;;     [:li "There are many deck archetypes and playstyles in Netrunner. All are valid and should be respected. If you do not wish to play against a certain deck or playstyle please write it in the game title (“No Project Vacheron” or “Experienced/New players only”). If the game has already started, politely explain to your opponent and concede the game."]
;;     [:li "The global chat tab should only be used for Netrunner-related discussion (including unofficial rules clarifications) and for trying to reach out to users who may have disconnected. Inappropriate use of global chat includes disputes with other players, airing grievances, and everything outlined as unacceptable behavior below."]]
;;    [:h4 "Examples of unacceptable behavior include, but are not limited to, the following:"]
;;    [:ul.list.compact
;;     [:li "Harassing your opponent based on their playstyle or deck."]
;;     [:li "Game titles which could reasonably be considered inappropriate or offensive"]
;;     [:li "Trolling, insulting/derogatory comments, casual use of slurs, pejorative language, personal/political attacks, harassment, intimidation, threats, or anything outside the scope of playing Netrunner."]
;;     [:li "The use of sexualized language or imagery."]
;;     [:li "Making light of/making mocking comments about trigger warnings or content warnings."]
;;     [:li "Deliberately using incorrect pronouns for a person, especially after being informed of the correct ones. If unsure, use gender-neutral language."]]
;;    [:p "To report an incident or to contact the moderation team please email jnetmods@gmail.com
;; If reporting an incident, please include screenshots if possible."]
;;    [:p "Moderators will respond to offenses by attempting to contact users for resolution where possible. Repeated/severe offenses will be reviewed by the moderation team and met with temporary or permanent bans. All bans are reviewed by the entire moderation team."]
;;    [:p "Moderators are not here to settle rules disputes or otherwise serve as judges. If there is a rules disagreement, bringing it to a community space is the best plan for resolution."]
      [:h2 "欢迎来到未来！"]
      [:h4 "简介"]
      [:p "矩阵潜袭由万智牌之父理查德·加菲尔德设计，是一款非对称双人对战卡牌游戏，设定在一个反乌托邦的未来世界，四家巨型公司控制了日常生活的方方面面，而被称为“潜袭者”的传奇黑客以对抗公司影响力为目的，不断黑入公司服务器以阻止公司推进其议案。该游戏自问世后连续12年蝉联全球最大桌游网站BGG定制对战桌游排行榜第一名，目前由非营利玩家社群Null Signal Games运营。"]
      [:p "本网站旨在为线上《矩阵潜袭》游戏提供便利。请注意，本网站并未完整实现该游戏的所有功能。"]
      [:h4 "新手入门"]
      [:p "如果您是《矩阵潜袭》的新玩家，可以通过以下资源了解与入门这款游戏："]
      [:ul.list.compact
       [:li "公众号“矩阵潜袭”的 " [:a {:href "https://mp.weixin.qq.com/s/sbmPOZkvWMCeZb7rKw4OAg" :target "_blank"} "新手指南"] " 是相当好的入门规则教学"]
       [:li "您也可以在 " [:a {:href "https://tutorial.sneakdoorbeta.net/" :target "_blank"} "这里"] " 进行交互式游戏教学，或在了解了基本规则后尝试与AI对战"]
       [:li "B站 " [:a {:href "https://www.bilibili.com/video/BV1iN411F7AD/" :target "_blank"} "矩阵潜袭教学"] " 和 " [:a {:href "https://www.bilibili.com/video/BV1XK1oYNEAT/" :target "_blank"} "矩阵核心网关教学牌组实战"] " 是相当好的视频教程"]
       [:li "您可以通过B站视频 " [:a {:href "https://www.bilibili.com/video/BV1F8amerENP/" :target "_blank"} "矩阵潜袭入坑指南2024"] " 了解这款游戏的环境（请注意：其中一些内容可能已经过时）"]
       [:li "以及公众号“矩阵潜袭”的 " [:a {:href "https://mp.weixin.qq.com/s/3JMgaZUCX97FpfW6pDW8jw" :target "_blank"} "新人必看合集"] " 了解这款游戏的方方面面"]
       ]
      [:h4 "玩家礼仪"]
      [:p "《矩阵潜袭》有多种卡组类型与对战风格，均属合理且应受尊重。若您不愿与特定卡组或玩法对战，请在房间标题中注明（如“禁用傲金公司”或“仅限老手/新手”）。若对局已开始，请礼貌说明后认输退出。"]
      [:p "游戏中不可接受的行为包括但不限于："]
      [:ul.list.compact
       [:li "因对手的玩法或卡组进行骚扰"]
       [:li "使用可能引发不适或冒犯的房间标题"]
       [:li "挑衅、嘲弄、侮辱性言论"]
       [:li "随意使用歧视性用语、贬损性、性暗示语言"]
       [:li "人身攻击、骚扰、恐吓、威胁等与游戏无关的言行"]
       ]
      [:p "如您遇到出现上述行为的玩家，可在QQ群内反馈（并最好附上对应行为的截图）"]
      [:h4 "遇到问题"]
      [:p "游戏过程中，如您遇到网站出现问题，可在QQ群内反馈，或访问" [:a {:href "https://github.com/eric03742/netrunner-arena" :target "_blank"} "项目代码仓库"] "提交 issue。"]
      [:h4 "鸣谢"]
      [:p "感谢“深网计划”对本网站的支持。"]
      [:p "本网站是 Jinteki.net 的国内镜像站，感谢 Jinteki.net 的开发者们无私地将他们的网站作为" [:a {:href "https://github.com/mtgred/netrunner" :target "_blank"} "开源项目"] "发布。"]
      [:p "感谢所有参与了本网站开发及测试的朋友们。"]
      [:p "感谢每一个来这里游玩《矩阵潜袭》的你。"]
      [:h4 "最后"]
      [:p "祝玩得开心顺利！Always be Running！"]
   ])

(defn landing []
  [:div.page-container
   [:div.worlds2020]
   [:div.landing-message
    [:h4 "关注“矩阵潜袭”公众号或加入QQ群706776764以获取游戏规则及更多资源。"]]
   landing-content])

