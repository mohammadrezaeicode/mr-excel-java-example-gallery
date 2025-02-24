package io.github.mohammadrezaeicode.examples;

import io.github.mohammadrezaeicode.excel.model.MultiStyleValue;
import io.github.mohammadrezaeicode.model.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ExampleData {
    public static List ex4(){
        return Arrays.asList(
                DateColumn.builder().date("2023-08-01").
                        column1( 5).
                        column2( 10).
                        column3( 15).
                        column4( 20).
                        column5( 25).build(),
                DateColumn.builder().date("2023-08-02").
                        column1( 7).
                        column2( 14).
                        column3( 21).
                        column4( 28).
                        column5( 35).build(),
                DateColumn.builder().date("2023-08-03").
                        column1( 3).
                        column2( 6).
                        column3( 9).
                        column4( 12).
                        column5( 15).build(),
                DateColumn.builder().date("2023-08-04").
                        column1( 12).
                        column2( 24).
                        column3( 36).
                        column4( 48).
                        column5( 60).build(),
                DateColumn.builder().date("2023-08-05").
                        column1( 8).
                        column2( 16).
                        column3( 24).
                        column4( 32).
                        column5( 40).build()
        );
    }
    public static List ex2Sheet1(){
        return Arrays.asList(
                User.builder().id(7209449538085L).
                        name( "Tabitha").
                        surname( "Terry").
                        parentId( 6998520522169L).
                        work( "Computer repair technician").
                        birthDate( "1853-04-10T01:23:16.181Z").build(),
                User.builder().id(4132538644996L).
                        name( "Grace").
                        surname( "MacTavish").
                        parentId( 6840142476821L).
                        work( "Retired").
                        birthDate( "1854-04-03T08:51:19.825Z").build(),
                User.builder().id(778493423064L).
                        name( "Bailey").
                        surname( "Byram").
                        parentId( 7137102781494L).
                        work( "Occupational Therapist- Neonatal/ Pediatric").
                        birthDate( "1852-08-13T18:07:57.408Z").build(),
                User.builder().id(510141747289L).
                        name( "Sherman").
                        surname( "Joseph").
                        parentId( 602149579197L).
                        work( "work from home").
                        birthDate( "1854-12-12T05:48:31.806Z").build(),
                User.builder().id(5513277402976L).
                        name( "Ryder").
                        surname( "Watrous").
                        parentId( 7435302183884L).
                        work( "Welder").
                        birthDate( "1854-08-18T04:11:04.736Z").build(),
                User.builder().id(1032906540606L).
                        name( "Phoenix").
                        surname( "Netter").
                        parentId( 3204642808212L).
                        work( "Unemployed").
                        birthDate( "1854-07-19T07:53:58.843Z").build(),
                User.builder().id(343574032284L).
                        name( "Tonya").
                        surname( "Carpenter").
                        parentId( 3709985684199L).
                        work( "Pulmonologist").
                        birthDate( "1852-04-20T12:44:08.362Z").build(),
                User.builder().id(9497014533965L).
                        name( "Coral").
                        surname( "Hoskins").
                        parentId( 3497153671269L).
                        work( "Unemployed").
                        birthDate( "1854-12-01T22:08:59.891Z").build(),
                User.builder().id(4998374693826L).
                        name( "Billie").
                        surname( "Guthrie").
                        parentId( 1555796128163L).
                        work( "Skomorokh").
                        birthDate( "1853-11-10T14:06:54.037Z").build(),
                User.builder().id(95132218987L).
                        name( "Gertrude").
                        surname( "Clark").
                        parentId( 2324519652998L).
                        work( "Unemployed").
                        birthDate( "1852-12-22T20:12:13.237Z").build());
    }
    public static List ex2Sheet2(){
        return Arrays.asList(User.builder().id(7209449538085L).
                        name( "Tabitha").
                        surname( "Terry").
                        parentId( 6998520522169L).
                        work( "Computer repair technician").
                        birthDate( "1853-04-10T01:23:16.181Z").build(),
                User.builder().id(4132538644996L).
                        name( "Grace").
                        surname( "MacTavish").
                        parentId( 6840142476821L).
                        work( "Retired").
                        birthDate( "1854-04-03T08:51:19.825Z").build(),
                User.builder().id(778493423064L).
                        name( "Bailey").
                        surname( "Byram").
                        parentId( 7137102781494L).
                        work( "Occupational Therapist- Neonatal/ Pediatric").
                        birthDate( "1852-08-13T18:07:57.408Z").build(),
                User.builder().id(510141747289L).
                        name( "Sherman").
                        surname( "Joseph").
                        parentId( 602149579197L).
                        work( "work from home").
                        birthDate( "1854-12-12T05:48:31.806Z").build(),
                User.builder().id(5513277402976L).
                        name( "Ryder").
                        surname( "Watrous").
                        parentId( 7435302183884L).
                        work( "Welder").
                        birthDate( "1854-08-18T04:11:04.736Z").build(),
                User.builder().id(1032906540606L).
                        name( "Phoenix").
                        surname( "Netter").
                        parentId( 3204642808212L).
                        work( "Unemployed").
                        birthDate( "1854-07-19T07:53:58.843Z").build(),
                User.builder().id(343574032284L).
                        name( "Tonya").
                        surname( "Carpenter").
                        parentId( 3709985684199L).
                        work( "Pulmonologist").
                        birthDate( "1852-04-20T12:44:08.362Z").build(),
                User.builder().id(9497014533965L).
                        name( "Coral").
                        surname( "Hoskins").
                        parentId( 3497153671269L).
                        work( "Unemployed").
                        birthDate( "1854-12-01T22:08:59.891Z").build(),
                User.builder().id(4998374693826L).
                        name( "Billie").
                        surname( "Guthrie").
                        parentId( 1555796128163L).
                        work( "Skomorokh").
                        birthDate( "1853-11-10T14:06:54.037Z").build(),
                User.builder().id(95132218987L).
                        name( "Gertrude").
                        surname( "Clark").
                        parentId( 2324519652998L).
                        work( "Unemployed").
                        birthDate( "1852-12-22T20:12:13.237Z").build(),
                User.builder().id(4353606351491L).
                        name( "Corinna").
                        surname( "Powell").
                        parentId( 6303270085856L).
                        work( "Business analyst").
                        birthDate( "1853-05-13T14:00:27.525Z").build(),
                User.builder().id(9821977853501L).
                        name( "Alexander").
                        surname( "Rowlands").
                        parentId( 5281151854805L).
                        work( "work from home").
                        birthDate( "1852-07-29T02:34:26.818Z").build(),
                User.builder().id(1789259068865L).
                        name( "Khloe").
                        surname( "Allsebrook").
                        parentId( 9085712911231L).
                        work( "Internet celebrity").
                        birthDate( "1853-10-10T01:28:17.141Z").build(),
                User.builder().id(1547071460137L).
                        name( "Sky").
                        surname( "Hyde").
                        parentId( 3932330547777L).
                        work( "Retired").
                        birthDate( "1854-11-03T05:06:37.477Z").build(),
                User.builder().id(8054019194308L).
                        name( "Niles").
                        surname( "Dudley").
                        parentId( 9487606369042L).
                        work( "Porter").
                        birthDate( "1852-09-01T05:46:03.040Z").build(),
                User.builder().id(6759490924297L).
                        name( "Valda").
                        surname( "Bye").
                        parentId( 5146431233541L).
                        work( "Management").
                        birthDate( "1853-09-29T00:33:43.968Z").build(),
                User.builder().id(6625148457816L).
                        name( "Keaton").
                        surname( "Boothe").
                        parentId( 4935663844945L).
                        work( "Mental Health Counselor").
                        birthDate( "1854-10-25T16:56:16.488Z").build(),
                User.builder().id(5968154253225L).
                        name( "Gill").
                        surname( "Voyles").
                        parentId( 1358001926693L).
                        work( "Ophthalmologist").
                        birthDate( "1853-09-13T06:48:43.632Z").build(),
                User.builder().id(7963337332727L).
                        name( "Josiah").
                        surname( "Engleman").
                        parentId( 4661422144081L).
                        work( "Unemployed").
                        birthDate( "1854-05-31T14:12:01.180Z").build(),
                User.builder().id(7276643575609L).
                        name( "Luca").
                        surname( "Alderman").
                        parentId( 1257836499862L).
                        work( "Unemployed").
                        birthDate( "1852-07-04T12:18:59.130Z").build(),
                User.builder().id(4670743239553L).
                        name( "Kathleen").
                        surname( "Walle").
                        parentId( 4441682230999L).
                        work( "Computer scientist").
                        birthDate( "1854-08-22T11:02:53.945Z").build(),
                User.builder().id(7400518637533L).
                        name( "Deacon").
                        surname( "Humpherys").
                        parentId( 1446747090804L).
                        work( "Conservation officer").
                        birthDate( "1854-06-07T15:31:11.006Z").build(),
                User.builder().id(6500156651299L).
                        name( "Carina").
                        parentId( 5968154253225L).
                        surname( "Voyles").
                        work( "Chiropodist").
                        birthDate( "1867-02-15T16:59:13.152Z").build(),
                User.builder().id(1706294044283L).
                        name( "Tucker").
                        parentId( 7963337332727L).
                        surname( "Engleman").
                        work( "Podiatrist").
                        birthDate( "1866-12-09T07:32:17.900Z").build(),
                User.builder().id(3173442171339L).
                        name( "Clarissa").
                        surname( "Harvie").
                        parentId( 8355293899833L).
                        work( "Botanist").
                        birthDate( "1853-03-29T17:49:36.408Z").build(),
                User.builder().id(5788750055334L).
                        name( "Melina").
                        parentId( 6500156651299L).
                        surname( "Voyles").
                        work( "Welder").
                        birthDate( "1882-08-16T00:50:47.934Z").build(),
                User.builder().id(8843316769405L).
                        name( "Keith").
                        surname( "Ludington").
                        parentId( 6356556019596L).
                        work( "Usher").
                        birthDate( "1852-06-15T06:27:32.233Z").build(),
                User.builder().id(4207038883417L).
                        name( "Aaliyah").
                        surname( "Woodville").
                        parentId( 5819329552655L).
                        work( "Scop").
                        birthDate( "1854-10-08T02:36:29.656Z").build(),
                User.builder().id(8313555968957L).
                        name( "Harper").
                        surname( "Allcock").
                        parentId( 7731940327551L).
                        work( "Songwriter").
                        birthDate( "1853-05-09T23:05:40.195Z").build(),
                User.builder().id(8321384691545L).
                        name( "Johnny").
                        parentId( 778493423064L).
                        surname( "Byram").
                        work( "Copy editor").
                        birthDate( "1873-12-17T06:16:58.798Z").build(),
                User.builder().id(8774024011461L).
                        name( "Jody").
                        parentId( 4132538644996L).
                        surname( "MacTavish").
                        work( "Graphic designer").
                        birthDate( "1872-08-31T01:04:39.456Z").build(),
                User.builder().id(3306066401344L).
                        name( "Mercedes").
                        surname( "Roberts").
                        parentId( 6748854838600L).
                        work( "Feller").
                        birthDate( "1852-05-10T11:58:05.415Z").build(),
                User.builder().id(6496588012690L).
                        name( "Renee").
                        parentId( 8054019194308L).
                        surname( "Dudley").
                        work( "Plumber").
                        birthDate( "1873-12-17T21:54:18.411Z").build(),
                User.builder().id(2454674611066L).
                        name( "Jill").
                        parentId( 6759490924297L).
                        surname( "Bye").
                        work( "Dermatology Physician Assistant").
                        birthDate( "1865-03-20T17:31:14.827Z").build(),
                User.builder().id(8810365866300L).
                        name( "Townsend").
                        parentId( 6496588012690L).
                        surname( "Dudley").
                        work( "Psychiatric Nurse Practitioner").
                        birthDate( "1885-09-06T14:23:00.439Z").build(),
                User.builder().id(1971028749432L).
                        name( "George").
                        surname( "Georgeson").
                        parentId( 3375820364841L).
                        work( "Director").
                        birthDate( "1854-10-26T04:21:32.595Z").build(),
                User.builder().id(1113599419684L).
                        name( "Jess").
                        surname( "Summers").
                        parentId( 8197445224794L).
                        work( "Showrunner").
                        birthDate( "1853-06-20T11:49:42.822Z").build(),
                User.builder().id(260692577513L).
                        name( "Salma").
                        surname( "Bagshaw").
                        parentId( 8646582409037L).
                        work( "Technical director").
                        birthDate( "1854-08-02T11:08:13.512Z").build(),
                User.builder().id(4717646566698L).
                        name( "Jakob").
                        parentId( 7400518637533L).
                        surname( "Humpherys").
                        work( "Draper").
                        birthDate( "1875-09-29T02:59:25.272Z").build(),
                User.builder().id(2812851588162L).
                        name( "Ezekiel").
                        surname( "Glanton").
                        parentId( 8694260373371L).
                        work( "Retired").
                        birthDate( "1853-07-25T22:30:11.069Z").build(),
                User.builder().id(546554428930L).
                        name( "Darrin").
                        parentId( 7963337332727L).
                        surname( "Engleman").
                        work( "Healthcare science").
                        birthDate( "1867-11-05T12:21:08.349Z").build(),
                User.builder().id(5568159710759L).
                        name( "Kirsten").
                        parentId( 6496588012690L).
                        surname( "Dudley").
                        work( "work from home").
                        birthDate( "1890-06-13T12:43:09.597Z").build(),
                User.builder().id(3385269771452L).
                        name( "Emerald").
                        parentId( 6496588012690L).
                        surname( "Dudley").
                        work( "Retired").
                        birthDate( "1892-05-01T07:40:24.011Z").build(),
                User.builder().id(8533172021814L).
                        name( "Andre").
                        parentId( 8321384691545L).
                        surname( "Byram").
                        work( "Retired").
                        birthDate( "1892-02-25T01:12:38.146Z").build(),
                User.builder().id(4710524419131L).
                        name( "Patty").
                        surname( "Dick").
                        parentId( 1760988033690L).
                        work( "Technical writer").
                        birthDate( "1853-01-11T14:35:24.298Z").build(),
                User.builder().id(1805461552938L).
                        name( "Elisha").
                        surname( "Bradford").
                        parentId( 8622160581630L).
                        work( "Theatre practitioner").
                        birthDate( "1853-06-30T19:11:12.105Z").build(),
                User.builder().id(6542853113042L).
                        name( "Zoe").
                        parentId( 3173442171339L).
                        surname( "Harvie").
                        work( "Showgirl").
                        birthDate( "1870-12-08T18:18:09.844Z").build(),
                User.builder().id(1718991242108L).
                        name( "Drew").
                        surname( "Ashby").
                        parentId( 3010550761310L).
                        work( "Retired").
                        birthDate( "1854-10-23T05:29:23.476Z").build(),
                User.builder().id(1334633156399L).
                        name( "Marie").
                        surname( "Tibbets").
                        parentId( 2575362966990L).
                        work( "Geotechnical Engineer").
                        birthDate( "1854-09-01T14:29:47.329Z").build(),
                User.builder().id(5668998711075L).
                        name( "Dulcie").
                        surname( "Derwin").
                        parentId( 7518120488089L).
                        work( "Emcee").
                        birthDate( "1854-03-09T04:56:18.697Z").build(),
                User.builder().id(248786146102L).
                        name( "Shania").
                        surname( "Fleetwood").
                        parentId( 7804160535710L).
                        work( "Station").
                        birthDate( "1854-10-06T02:01:08.206Z").build(),
                User.builder().id(9525762609317L).
                        name( "Ana").
                        parentId( 7209449538085L).
                        surname( "Terry").
                        work( "Manager (Guard)").
                        birthDate( "1867-07-30T11:59:23.739Z").build(),
                User.builder().id(934688923249L).
                        name( "Alicia").
                        parentId( 6542853113042L).
                        surname( "Harvie").
                        work( "Blogger").
                        birthDate( "1890-10-06T17:26:42.673Z").build(),
                User.builder().id(7306715236916L).
                        name( "Petula").
                        surname( "Newey").
                        parentId( 1042642003017L).
                        work( "Geoff").
                        birthDate( "1852-10-04T08:37:28.785Z").build(),
                User.builder().id(8234536999381L).
                        name( "Mary").
                        surname( "Rose").
                        parentId( 5386302345101L).
                        work( "Signal maintainer").
                        birthDate( "1854-02-15T23:14:32.174Z").build(),
                User.builder().id(7494359933717L).
                        name( "Brittany").
                        parentId( 1805461552938L).
                        surname( "Bradford").
                        work( "Unemployed").
                        birthDate( "1875-01-06T09:30:49.999Z").build(),
                User.builder().id(7049262735491L).
                        name( "Juniper").
                        surname( "Marks").
                        parentId( 9127368958939L).
                        work( "work from home").
                        birthDate( "1854-11-26T11:05:44.683Z").build(),
                User.builder().id(7781822521224L).
                        name( "Edris").
                        surname( "Godwin").
                        parentId( 6016143008277L).
                        work( "work from home").
                        birthDate( "1854-09-13T08:22:46.191Z").build(),
                User.builder().id(9078112227633L).
                        name( "Kaitlin").
                        surname( "Minogue").
                        parentId( 95176825076L).
                        work( "Clinical pharmaceutical scientist").
                        birthDate( "1852-05-08T21:59:27.773Z").build(),
                User.builder().id(3055221397713L).
                        name( "Lauretta").
                        parentId( 6759490924297L).
                        surname( "Bye").
                        work( "Track inspector").
                        birthDate( "1867-05-21T06:07:21.273Z").build(),
                User.builder().id(3794107972026L).
                        name( "Dorothy").
                        surname( "Bostick").
                        parentId( 6850128149597L).
                        work( "Go-go dancer").
                        birthDate( "1853-03-06T19:01:31.143Z").build(),
                User.builder().id(1698494645377L).
                        name( "Cameron").
                        surname( "Torney").
                        parentId( 770004791023L).
                        work( "Advertising designer").
                        birthDate( "1854-07-17T07:16:12.429Z").build(),
                User.builder().id(841895938898L).
                        name( "Shepherd").
                        parentId( 4717646566698L).
                        surname( "Humpherys").
                        work( "Quilter").
                        birthDate( "1897-02-23T22:01:59.520Z").build(),
                User.builder().id(7914083691988L).
                        name( "Alisha").
                        surname( "Wind").
                        parentId( 1656884957449L).
                        work( "Veterinarian").
                        birthDate( "1853-04-04T07:49:55.453Z").build(),
                User.builder().id(5015337941343L).
                        name( "Agnes").
                        parentId( 9821977853501L).
                        surname( "Rowlands").
                        work( "Rhapsode").
                        birthDate( "1865-09-14T16:07:21.238Z").build(),
                User.builder().id(6498601438355L).
                        name( "Harvard").
                        parentId( 1971028749432L).
                        surname( "Georgeson").
                        work( "Retired").
                        birthDate( "1874-02-03T05:44:32.483Z").build(),
                User.builder().id(6162073883494L).
                        name( "Lizzie").
                        surname( "Allitt").
                        parentId( 7443156411879L).
                        work( "work from home").
                        birthDate( "1854-02-09T14:41:55.210Z").build(),
                User.builder().id(4027876312592L).
                        name( "Samuel").
                        parentId( 8843316769405L).
                        surname( "Ludington").
                        work( "Neuroradiographer").
                        birthDate( "1864-11-13T01:39:02.494Z").build(),
                User.builder().id(6910084039563L).
                        name( "Layla").
                        parentId( 95132218987L).
                        surname( "Clark").
                        work( "CT Radiographer").
                        birthDate( "1868-09-02T07:10:46.829Z").build(),
                User.builder().id(2583927007530L).
                        name( "Darby").
                        surname( "Yeakel").
                        parentId( 1323435182904L).
                        work( "Data designer").
                        birthDate( "1853-05-12T16:14:07.161Z").build(),
                User.builder().id(7448530790803L).
                        name( "Winnifred").
                        surname( "Rykener").
                        parentId( 9181202451521L).
                        work( "Unemployed").
                        birthDate( "1852-03-20T06:48:07.162Z").build(),
                User.builder().id(4842667119782L).
                        name( "Lacey").
                        parentId( 7400518637533L).
                        surname( "Humpherys").
                        work( "Unemployed").
                        birthDate( "1875-03-04T17:56:15.949Z").build(),
                User.builder().id(3926090190617L).
                        name( "Beverley").
                        surname( "McHatton").
                        parentId( 8769830982857L).
                        work( "Field warden").
                        birthDate( "1853-06-02T04:00:57.288Z").build(),
                User.builder().id(5107646185720L).
                        name( "Cassidy").
                        parentId( 7276643575609L).
                        surname( "Alderman").
                        work( "Retired").
                        birthDate( "1863-12-22T05:38:41.764Z").build(),
                User.builder().id(6617379016460L).
                        name( "Jeannie").
                        surname( "Artley").
                        parentId( 5730519222203L).
                        work( "Psychologist").
                        birthDate( "1854-11-06T11:20:41.234Z").build(),
                User.builder().id(5415904134291L).
                        name( "Shannon").
                        parentId( 5513277402976L).
                        surname( "Watrous").
                        work( "Artistic director").
                        birthDate( "1872-02-22T13:25:42.485Z").build(),
                User.builder().id(8625554360699L).
                        name( "Margot").
                        surname( "Glidewell").
                        parentId( 5710615384493L).
                        work( "Rhapsode").
                        birthDate( "1854-10-31T13:03:27.754Z").build(),
                User.builder().id(2167634099186L).
                        name( "Annie").
                        parentId( 9497014533965L).
                        surname( "Hoskins").
                        work( "Spotlight Operator").
                        birthDate( "1866-11-19T12:52:54.706Z").build(),
                User.builder().id(2969518168386L).
                        name( "Velma").
                        parentId( 7209449538085L).
                        surname( "Terry").
                        work( "Web developer").
                        birthDate( "1871-10-28T11:08:07.215Z").build(),
                User.builder().id(9376340620106L).
                        name( "Cheryl").
                        parentId( 1706294044283L).
                        surname( "Engleman").
                        work( "Stunt performer").
                        birthDate( "1877-10-11T10:56:39.191Z").build(),
                User.builder().id(4611179134961L).
                        name( "Mayola").
                        surname( "Whyte").
                        parentId( 2106785096820L).
                        work( "Painters").
                        birthDate( "1854-12-18T21:34:21.340Z").build(),
                User.builder().id(3330893717600L).
                        name( "Imogen").
                        surname( "Brinkley").
                        parentId( 4855829489899L).
                        work( "Nephrology Physician Assistant").
                        birthDate( "1853-02-02T11:36:44.244Z").build(),
                User.builder().id(2322780495725L).
                        name( "Gillian").
                        parentId( 8313555968957L).
                        surname( "Allcock").
                        work( "Rhapsode").
                        birthDate( "1871-08-02T14:41:44.723Z").build(),
                User.builder().id(9096773496327L).
                        name( "Crossley").
                        surname( "Oatway").
                        parentId( 4983996020215L).
                        work( "Flagman").
                        birthDate( "1854-09-04T11:14:16.967Z").build(),
                User.builder().id(7912768369102L).
                        name( "Jack").
                        surname( "Cortright").
                        parentId( 1954893391139L).
                        work( "Racing driver").
                        birthDate( "1852-08-02T03:15:25.294Z").build(),
                User.builder().id(4936706920188L).
                        name( "Marilyn").
                        parentId( 1805461552938L).
                        surname( "Bradford").
                        work( "Park ranger").
                        birthDate( "1868-03-15T10:44:36.661Z").build(),
                User.builder().id(4507151706136L).
                        name( "Malcolm").
                        surname( "Fish").
                        parentId( 10892055752L).
                        work( "Otorhinolaryngology Physician assistant").
                        birthDate( "1852-09-21T09:57:38.875Z").build(),
                User.builder().id(1002471008138L).
                        name( "Sapphire").
                        surname( "Plumb").
                        parentId( 7581067886471L).
                        work( "Physical Therapist").
                        birthDate( "1853-10-01T07:37:10.197Z").build(),
                User.builder().id(935177490762L).
                        name( "Cracroft").
                        parentId( 4710524419131L).
                        surname( "Dick").
                        work( "Emergency medical technician").
                        birthDate( "1874-06-28T07:03:04.205Z").build(),
                User.builder().id(3214614421553L).
                        name( "Sparrow").
                        surname( "Ashbridge").
                        parentId( 957660638347L).
                        work( "Deputy Station Master").
                        birthDate( "1852-04-10T04:05:16.806Z").build(),
                User.builder().id(7486640594543L).
                        name( "Krista").
                        surname( "Pancake").
                        parentId( 7378652821449L).
                        work( "Plumber").
                        birthDate( "1854-08-23T21:50:03.378Z").build(),
                User.builder().id(4208092032684L).
                        name( "Jolie").
                        surname( "Williamson").
                        parentId( 542240779474L).
                        work( "Stage crew").
                        birthDate( "1853-10-29T00:38:32.373Z").build(),
                User.builder().id(265753551687L).
                        name( "Holbrook").
                        parentId( 4936706920188L).
                        surname( "Bradford").
                        work( "Hack writer").
                        birthDate( "1884-05-07T02:08:54.196Z").build(),
                User.builder().id(8299001953232L).
                        name( "Robert").
                        parentId( 3173442171339L).
                        surname( "Harvie").
                        work( "Ticketing agent").
                        birthDate( "1873-06-05T02:00:54.119Z").build(),
                User.builder().id(4569395503128L).
                        name( "Heather").
                        surname( "Exton").
                        parentId( 9258857749445L).
                        work( "Millwright").
                        birthDate( "1854-07-30T13:43:50.734Z").build(),
                User.builder().id(3805806644419L).
                        name( "Avis").
                        surname( "Waddington").
                        parentId( 7607565215691L).
                        work( "Soloist").
                        birthDate( "1853-05-16T10:13:10.174Z").build(),
                User.builder().id(215914970248L).
                        name( "Lanna").
                        parentId( 3926090190617L).
                        surname( "McHatton").
                        work( "Poet").
                        birthDate( "1871-10-23T19:08:06.184Z").build(),
                User.builder().id(405274833240L).
                        name( "Demetria").
                        parentId( 4670743239553L).
                        surname( "Walle").
                        work( "Signalman").
                        birthDate( "1874-07-17T12:36:59.100Z").build(),
                User.builder().id(2703780723460L).
                        name( "Grayson").
                        parentId( 7914083691988L).
                        surname( "Wind").
                        work( "Bylaw enforcement officer").
                        birthDate( "1866-08-17T16:34:36.854Z").build(),
                User.builder().id(2649091306594L).
                        name( "Kathryn").
                        parentId( 8313555968957L).
                        surname( "Allcock").
                        work( "Station").
                        birthDate( "1874-09-20T04:49:58.207Z").build());
    }
    public static List ex5(){
        return Arrays.asList(
                FormatModel.builder().date("2023-08-01").
                        time("09:00 AM").
                        percentage(0.7525).
                        Float(0.7525).
                        fraction("1/4").
                        longNumberColumn1(123456789012345L).
                        longNumberColumn2(987654321098765L).build(),
                FormatModel.builder().date("2023-08-02").
                        time("02:30 PM").
                        percentage(0.4275).
                        Float(0.4275).
                        fraction("3/8").
                        longNumberColumn1(456789012345678L).
                        longNumberColumn2(876543210987654L).build(),
                FormatModel.builder().date("2023-08-03").
                        time("10:45 AM").
                        percentage(0.955).
                        Float(0.955).
                        fraction("5/6").
                        longNumberColumn1(789012345678901L).
                        longNumberColumn2(765432109876543L).build(),
                FormatModel.builder().date("2023-08-04").
                        time("04:15 PM").
                        percentage(0.2875).
                        Float(0.2875).
                        fraction("2/7").
                        longNumberColumn1(123450987654321L).
                        longNumberColumn2(654321098765432L).build(),
                FormatModel.builder().date("2023-08-05").
                        time("08:20 AM").
                        percentage(0.6).
                        Float(0.6).
                        fraction("4/5").
                        longNumberColumn1(543210987654321L).
                        longNumberColumn2(543210987654321L).build()
        );
    }
    public static List ex6(){
        return Arrays.asList(
                FormatModel.builder().date("2023-08-01").
                        time("09:00 AM").
                        percentage(0.7525).
                            Float(0.7525).
                fraction("1/4").
                longNumberColumn1(123456789012345L).
                longNumberColumn2(987654321098765L).build(),
                FormatModel.builder().date("2023-08-01").
                        time("02:30 PM").
                        percentage(0.4275).
                            Float(0.4275).
                fraction("3/8").
                longNumberColumn1(123456789012345L).
                longNumberColumn2(876543210987654L).build(),
                FormatModel.builder().date("2023-08-03").
                        time("10:45 AM").
                        percentage(0.955).
                            Float(0.955).
                fraction("5/6").
                longNumberColumn1(789012345678901L).
                longNumberColumn2(765432109876543L).build(),
                FormatModel.builder().date("2023-08-04").
                        time("04:15 PM").
                        percentage(0.2875).
                            Float(0.2875).
                fraction("2/7").
                longNumberColumn1(123450987654321L).
                longNumberColumn2(654321098765432L).build(),
                FormatModel.builder().date("2023-08-05").
                        time("08:20 AM").
                        percentage(0.6).
                            Float(0.6).
                fraction("4/5").
                longNumberColumn1(543210987654321L).
                longNumberColumn2(543210987654321L).build(),
                FormatModel.builder().date("2023-08-05").
                        time("08:20 AM").
                        percentage(0.6).
                            Float(0.6).
                fraction("4/5").
                longNumberColumn1(543210987654321L).
                longNumberColumn2(543210987654321L).build(),
                FormatModel.builder().date("2023-08-05").
                        time("08:20 AM").
                        percentage(0.6).
                            Float(0.61).
                fraction("4/5").
                longNumberColumn1(543210987654321L).
                longNumberColumn2(543210987654321L).build()
        );
    }

    public static List ex7(){
        return Arrays.asList(
                OutlineTest.eBuilder().id(1).name("Category A").column1(10).column2(20).column3(30).column4(40).column5(50).outlineLevel(1).build(),
                OutlineTest.eBuilder().id(2).name("Item 1").column1(5).column2(10).column3(15).column4(20).column5(25).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(3).name("Item 2").column1(3).column2(6).column3(9).column4(12).column5(15).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(4).name("Item 3").column1(2).column2(4).column3(6).column4(8).column5(10).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(5).name("Category B").column1(20).column2(40).column3(60).column4(80).column5(100).outlineLevel(1).build(),
                OutlineTest.eBuilder().id(6).name("Item 1").column1(10).column2(20).column3(30).column4(40).column5(50).hidden(true).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(7).name("Item 2").column1(6).column2(12).column3(18).column4(24).column5(30).hidden(true).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(8).name("Item 3").column1(4).column2(8).column3(12).column4(16).column5(20).hidden(true).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(9).name("Category C").column1(30).column2(60).column3(90).column4(120).column5(150).outlineLevel(1).build(),
                OutlineTest.eBuilder().id(10).name("Item 1").column1(15).column2(30).column3(45).column4(60).column5(75).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(11).name("Item 2").column1(9).column2(18).column3(27).column4(36).column5(45).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(12).name("Item 3").column1(6).column2(12).column3(18).column4(24).column5(30).outlineLevel(2).build(),
                OutlineTest.eBuilder().id(13).name("Summary").column1(60).column2(120).column3(180).column4(240).column5(300).outlineLevel(3).build()
        );
    }
    public static List ex8(){
        return Arrays.asList(
                OutlineCustomPropertyTest.builder().id(1).
                        name("Category A").
                        column1(10).
                        column2(20).
                        column3(30).
                        column4(40).
                        column5(50).
                        h(30).
                        group( 1).build(),

                OutlineCustomPropertyTest.builder().id(2).
                        name("Item 1").
                        column1(5).
                        column2(10).
                        column3(15).
                        column4(20).
                        column5(25).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(3).
                        name("Item 2").
                        column1(3).
                        column2(6).
                        column3(9).
                        column4(12).
                        column5(15).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(4).
                        name("Item 3").
                        column1(2).
                        column2(4).
                        column3(6).
                        column4(8).
                        column5(10).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(5).
                        name("Category B").
                        column1(20).
                        column2(40).
                        column3(60).
                        column4(80).
                        column5(100).
                        h(30).
                        group( 1).build(),

                OutlineCustomPropertyTest.builder().id(6).
                        name("Item 1").
                        column1(10).
                        column2(20).
                        column3(30).
                        column4(40).
                        column5(50).
                        notShow(true).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(7).
                        name("Item 2").
                        column1(6).
                        column2(12).
                        column3(18).
                        column4(24).
                        column5(30).
                        notShow(true).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(8).
                        name("Item 3").
                        column1(4).
                        column2(8).
                        column3(12).
                        column4(16).
                        column5(20).
                        notShow(true).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(9).
                        name("Category C").
                        column1(30).
                        column2(60).
                        column3(90).
                        column4(120).
                        column5(150).
                        h(30).
                        group( 1).build(),

                OutlineCustomPropertyTest.builder().id(10).
                        name("Item 1").
                        column1(15).
                        column2(30).
                        column3(45).
                        column4(60).
                        column5(75).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(11).
                        name("Item 2").
                        column1(9).
                        column2(18).
                        column3(27).
                        column4(36).
                        column5(45).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(12).
                        name("Item 3").
                        column1(6).
                        column2(12).
                        column3(18).
                        column4(24).
                        column5(30).
                        h(30).
                        group( 2).build(),

                OutlineCustomPropertyTest.builder().id(13).
                        name("Summary").
                        column1(60).
                        column2(120).
                        column3(180).
                        column4(240).
                        column5(300).
                        h(30).
                        group( 3).build()
        );
    }
    public static List ex9(){
        return Arrays.asList(
                Unknown.builder().c1(0.756).c2(150).c3("John").c5(1).build(),
                Unknown.builder().c1(0.238).c2(120).c3("Jane").c5(0).build(),
                Unknown.builder().c1(0.865).c2(180).c3("Michael").c5(1).build(),
                Unknown.builder().c1(0.412).c2(130).c3("Emily").c5(0).build(),
                Unknown.builder().c1(0.587).c2(160).c3("William").c5(1).build()
        );
    }
    public static List ex14(){
        Class<CommentModel> commentModelClass=CommentModel.class;
        Method method=null;
        try {
            method=commentModelClass.getMethod("getC3");
        }catch (Exception ex){
            System.out.println("Method Not found!!");
        }
        return Arrays.asList(
                CommentModel.cBuilder().c1(0.756).c2(150).c3("John").c5(1).build(),
                CommentModel.cBuilder().c1(0.238).c2(120).c3("Jane").c5(0)
                        .addComment(method,"Comment on Jane")
                        .build(),
                CommentModel.cBuilder().c1(0.865).c2(180).c3("Michael").c5(1).build(),
                CommentModel.cBuilder().c1(0.412).c2(130).c3("Emily").c5(0).build(),
                CommentModel.cBuilder().c1(0.587).c2(160).c3("William").c5(1).build()
        );
    }
    public static List ex15() throws NoSuchMethodException {
        Class<CommentModel> commentModelClass=CommentModel.class;
        Method method=null;
        try {
            method=commentModelClass.getMethod("getC3");
        }catch (Exception ex){
            System.out.println("Method Not found!!");
        }
        return Arrays.asList(
                CommentModel.cBuilder().c1(0.756).c2(150).c3("John").c5(1).build(),
                CommentModel.cBuilder().c1(0.238).c2(120).c3("Jane").c5(0)
                        .addComment(method,"Comment on Jane")
                        .build(),
                CommentModel.cBuilder().c1(0.865).c2(180).c3("Michael")
                        .addMultiStyle(commentModelClass.getMethod("getC3"),Arrays.asList(
                                MultiStyleValue.builder()
                                        .styleId("t2")
                                        .value("M")
                                        .build(),
                                MultiStyleValue.builder()
                                        .value("ichael")
                                        .build()
                        ))
                        .c5(1).build(),
                CommentModel.cBuilder().c1(0.412).c2(130).c3("Emily").c5(0).build(),
                CommentModel.cBuilder().c1(0.587).c2(160).c3("William").c5(1).build()
        );
    }
    public static List ex16() throws NoSuchMethodException {
        Class<CommentModel> commentModelClass=CommentModel.class;
        Method method=null;
        try {
            method=commentModelClass.getMethod("getC3");
        }catch (Exception ex){
            System.out.println("Method Not found!!");
        }
        return Arrays.asList(
                CommentModelString.cBuilder().c1(0.756+"").c2(150+"").c3("John").c5(1+"").build(),
                CommentModelString.cBuilder().c1(0.238+"").c2(120+"").c3("Jane").c5(0+"")
                        .addComment(method,"Comment on Jane")
                        .build(),
                CommentModelString.cBuilder().c1(0.865+"").c2(180+"").c3("Michael")
                        .addMultiStyle(commentModelClass.getMethod("getC3"),Arrays.asList(
                                MultiStyleValue.builder()
                                        .styleId("t2")
                                        .value("M")
                                        .build(),
                                MultiStyleValue.builder()
                                        .value("ichael")
                                        .build()
                        ))
                        .c5(1+"").build(),
                CommentModelString.cBuilder().c1(0.412+"").c2(130+"").c3("Emily").c5(0+"").build(),
                CommentModelString.cBuilder().c1(0.587+"").c2(160+"").c3("William").c5(1+"").build()
        );
    }
    public static List ex17(){
        return Arrays.asList(
                Good.builder().name("Rose").
                        color("Red").
                        size("Medium").
                        price(5.99f).build(),
                Good.builder().name("Tulip").
                        color("Yellow").
                        size("Small").
                        price(2.49f).build(),
                Good.builder().name("Daisy").
                        color("White").
                        size("Small").
                        price(1.99f).build(),
                Good.builder().name("Sunflower").
                        color("Yellow").
                        size("Large").
                        price(4.99f).build(),
                Good.builder().name("Lily").
                        color("Pink").
                        size("Medium").
                        price(3.99f).build(),
                Good.builder().name("Daffodil").
                        color("Yellow").
                        size("Small").
                        price(2.49f).build(),
                Good.builder().name("Orchid").
                        color("Purple").
                        size("Medium").
                        price(6.99f).build(),
                Good.builder().name("Carnation").
                        color("Red").
                        size("Small").
                        price(1.99f).build(),
                Good.builder().name("Hyacinth").
                        color("Blue").
                        size("Medium").
                        price(4.49f).build(),
                Good.builder().name("Pansy").
                        color("Purple").
                        size("Small").
                        price(2.99f).build()
        );
    }
    public static List ex18(){
        return Arrays.asList(
                RandomModel.builder().column1(42).
                        column2("John").
                        column3(7).
                        column4("Doe").build(),
                RandomModel.builder().column1(25).
                        column2("Alice").
                        column3(13).
                        column4("Smith").build(),
                RandomModel.builder().column1(33).
                        column2("Bob").
                        column3(18).
                        column4("Johnson").build(),
                RandomModel.builder().column1(56).
                        column2("Eve").
                        column3(22).
                        column4("Brown").build()
        );
    }

    public static List ex19(){
        return Arrays.asList(
                RandomModel2.builder().column1(123).
                        column2(456).
                        column3(789).
                        column4(101).
                        column5(101).
                        column6(101).
                        column7(101).build(),
                RandomModel2.builder().column1(234).
                        column2(567).
                        column3(890).
                        column4(202).
                        column5(202).
                        column6(202).
                        column7(202).build(),
                RandomModel2.builder().column1(345).
                        column2(678).
                        column3(901).
                        column4(303).
                        column5(303).
                        column6(303).
                        column7(303).build(),
                RandomModel2.builder().column1(456).
                        column2(789).
                        column3(123).
                        column4(404).
                        column5(404).
                        column6(404).
                        column7(404).build()
        );
    }
    public static List ex22(){
        return Arrays.asList(
                RandomModel3.builder().date("2023-08-01").
                        column1(5).
                        column2(10).
                        column3("D15").
                        column4(20).
                        column5(25).build(),
                RandomModel3.builder().date("2023-08-02").
                        column1(7).
                        column2(14).
                        column3(" D21 ").
                        column4(28).
                        column5(35).build(),
                RandomModel3.builder().date("2023-08-03").
                        column1(3).
                        column2(6).
                        column3(" D9 ").
                        column4(12).
                        column5(15).build(),
                RandomModel3.builder().date("2023-08-04").
                        column1(12).
                        column2(24).
                        column3(" D36 ").
                        column4(48).
                        column5(60).build(),
                RandomModel3.builder().date("2023-08-05").
                        column1(8).
                        column2(16).
                        column3("D24").
                        column4(32).
                        column5(40).build()
        );
    }

    public static List<String> dropdownItems(){
        return Arrays.asList(
                "first option", "second option"
        );
    }
    public static List<String> dropdownLocation(){
        return Arrays.asList(
                "A2", "A4", "A8"
        );
    }
    public static List ex40(){
        return Arrays.asList(
                RandomModel4.builder().c1(dropdownItems().get(0)).build()
        );
    }
}
