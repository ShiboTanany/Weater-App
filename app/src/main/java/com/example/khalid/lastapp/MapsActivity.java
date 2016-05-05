package com.example.khalid.lastapp;

import android.content.Intent;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback  {
    static Marker X;
    static final LatLng MELBOURNE = new LatLng(-37.81319, 144.96298);
    static final LatLng EGYPT = new LatLng(26.820553, 30.802498);
    static final LatLng Andorra = new LatLng(42.546245,1.601554);
    static final LatLng United_Arab_Emirates = new LatLng(23.424076,53.847818);
    static final LatLng Afghanistan = new LatLng(33.93911,67.709953);
    static final LatLng Antigua_and_Barbuda = new LatLng(17.060816,-61.796428);
    static final LatLng Anguilla = new LatLng(18.220554,-63.068615);
    static final LatLng Albania = new LatLng(41.153332,20.168331);
    static final LatLng Armenia = new LatLng(40.069099,45.038189);
    static final LatLng Netherlands_Antilles = new LatLng(12.226079,-69.060087);
    static final LatLng Angola = new LatLng(-11.202692,17.873887);
    static final LatLng  Antarctica = new LatLng(-75.250973,-0.071389);
    static final LatLng Argentina  = new LatLng(-38.416097 ,-63.616672);
    static final LatLng American_Samoa = new LatLng(-14.270972,-170.132217);
    static final LatLng Austria = new LatLng(47.516231 ,14.550072);
    static final LatLng Australia = new LatLng(-25.274398 ,133.775136);
    static final LatLng Aruba = new LatLng(12.52111 ,-69.968338);
    static final LatLng Azerbaijan = new LatLng(40.143105 ,47.576927);
    static final LatLng Bosnia_and_Herzegovina = new LatLng(43.915886 ,17.679076);
    static final LatLng Barbados = new LatLng(13.193887 ,-59.543198);
    static final LatLng Bangladesh = new LatLng(23.684994,90.356331);
    static final LatLng Belgium = new LatLng(50.503887,4.469936);
    static final LatLng Burkina_Faso = new LatLng(12.238333 ,-1.561593);
    static final LatLng Bulgaria = new LatLng(42.733883 ,25.48583);
    static final LatLng Bahrain = new LatLng(25.930414,50.637772);
    static final LatLng Burundi = new LatLng(-3.373056 ,29.918886);
    static final LatLng Benin = new LatLng( 9.30769 ,2.315834);
    static final LatLng Bermuda = new LatLng(32.321384,-64.75737);
    //
    static final LatLng Brunei = new LatLng(4.535277 ,114.727669);
    static final LatLng  Bolivia = new LatLng(-16.290154,-63.588653);
    static final LatLng Brazil = new LatLng(-14.235004 ,-51.92528);
    static final LatLng Bahamas = new LatLng(25.03428 ,-77.39628);
    static final LatLng Bouvet_Island = new LatLng(-54.423199 ,3.413194);
    static final LatLng Botswana = new LatLng(-22.328474 ,24.684866);
    static final LatLng Belarus = new LatLng(53.709807,27.953389);
    static final LatLng Belize = new LatLng(17.189877 ,-88.49765);
    static final LatLng Canada= new LatLng(56.130366 ,-106.346771);
    static final LatLng Cocos_Islands = new LatLng(-12.164165 ,96.870956);
    static final LatLng Congo = new LatLng(-4.038333 ,21.758664);
    static final LatLng Central_African_Republic = new LatLng(6.611111 ,20.939444);
    //static final LatLng Congo [Republic] = new LatLng(-0.228021 ,15.827659);
    static final LatLng Switzerland = new LatLng(46.818188 ,8.227512);
    static final LatLng Côte_deIvoire = new LatLng(7.539989 ,-5.54708);
    static final LatLng Cook_Islands = new LatLng(-21.236736 ,-159.777671);
    static final LatLng Chile = new LatLng(-35.675147 ,-71.542969);
    static final LatLng Cameroon = new LatLng(7.369722 ,12.354722);
    static final LatLng China = new LatLng(35.86166,104.195397);
    static final LatLng Colombia = new LatLng(4.570868 ,-74.297333);
    static final LatLng Costa_Rica = new LatLng(9.748917 ,-83.753428);
    static final LatLng Cuba= new LatLng(21.521757 ,-77.781167);
    static final LatLng Cape_Verde = new LatLng(16.002082,-24.013197);
    static final LatLng Christmas_Island = new LatLng(-10.447525,105.690449);
    static final LatLng Cyprus= new LatLng(35.126413 ,33.429859);
    static final LatLng Czech_Republic = new LatLng(49.817492 ,15.472962);
    static final LatLng Germany = new LatLng(51.165691,10.451526);
    static final LatLng Djibouti = new LatLng(11.825138,42.590275);
    static final LatLng Denmark = new LatLng(56.26392,9.501785);
    static final LatLng Dominica = new LatLng(15.414999 ,-61.370976);
    static final LatLng Dominican_Republic = new LatLng(18.735693,-70.162651);
    static final LatLng Algeria = new LatLng(28.033886,1.659626);
    static final LatLng Ecuador = new LatLng(-1.831239,-78.183406);
    static final LatLng Estonia = new LatLng(58.595272,25.013607);
    static final LatLng Egypt = new LatLng(26.820553 ,30.802498);
    static final LatLng Western_Sahara = new LatLng(24.215527,-12.885834);
    static final LatLng Eritrea = new LatLng(15.179384,39.782334);
    static final LatLng Spain = new LatLng(40.463667,-3.74922);
//

    static final LatLng Ethiopia = new LatLng(9.145,40.489673);
    static final LatLng Finland = new LatLng(61.92411 ,25.748151);
    static final LatLng Fiji = new LatLng(-16.578193,179.414413);
    static final LatLng Falkland_Islands= new LatLng(-51.796253,-59.523613);
    static final LatLng Micronesia = new LatLng(7.425554,150.550812);
    static final LatLng Faroe_Islands = new LatLng(61.892635,-6.911806);
    static final LatLng France= new LatLng(46.227638,2.213749);
    static final LatLng Gabon = new LatLng(-0.803689,11.609444);
    static final LatLng United_Kingdom = new LatLng(55.378051,-3.435973);
    static final LatLng Grenada = new LatLng(12.262776 ,-61.604171);
    static final LatLng Georgia = new LatLng(42.315407,43.356892);
    static final LatLng French_Guiana= new LatLng(3.933889,-53.125782);
    static final LatLng Guernsey= new LatLng(49.465691,-2.585278);
    static final LatLng Ghana = new LatLng( 7.946527,-1.023194);
    static final LatLng Gibraltar= new LatLng(36.137741,-5.345374);
    static final LatLng Greenland= new LatLng(71.706936 ,-42.604303);
    static final LatLng Gambia = new LatLng(13.443182,-15.310139);
    static final LatLng Guinea= new LatLng(9.945587,-9.696645);
    static final LatLng Guadeloupe = new LatLng(16.995971,-62.067641);
    static final LatLng Equatorial_Guinea= new LatLng(1.650801,10.267895);
    static final LatLng Greece= new LatLng(39.074208,21.824312);
    static final LatLng South_Georgia  = new LatLng( -54.429579 ,-36.587909);
    static final LatLng Guatemala = new LatLng(15.783471,-90.230759);
    static final LatLng Guam= new LatLng(13.444304,144.793731);
    static final LatLng Guinea_Bissau= new LatLng(11.803749,-15.180413);
    static final LatLng Guyana = new LatLng(4.860416,-58.93018);
    static final LatLng Gaza_Strip = new LatLng(31.354676,34.308825);
    static final LatLng Hong_Kong= new LatLng(22.396428,114.109497);
    static final LatLng Heard_Island= new LatLng(40.463667,-3.74922);
    static final LatLng Honduras= new LatLng(15.199999 ,-86.241905);
    static final LatLng Croatia = new LatLng(45.1,15.2);
    static final LatLng Hungary= new LatLng(47.162494 ,19.503304);
    static final LatLng Indonesia= new LatLng(-0.789275 ,113.921327);
    static final LatLng Ireland= new LatLng(53.41291 ,-8.24389);
    // isreal is not exist in my map :D
    static final LatLng Palestine = new LatLng(31.046051,34.851612);
    static final LatLng Isle_of_Man= new LatLng(54.236107 ,-4.548056);
    static final LatLng India = new LatLng(20.593684,78.96288);
    static final LatLng Iraq = new LatLng(33.223191 ,43.679291);
    static final LatLng Iran= new LatLng(32.427908,53.688046);
    static final LatLng Iceland = new LatLng(64.963051,-19.020835);
    static final LatLng Italy = new LatLng(41.87194,12.56738);
    static final LatLng Jersey = new LatLng(49.214439 ,-2.13125);
    static final LatLng Jamaica = new LatLng(18.109581,-77.297508);
    static final LatLng Jordan = new LatLng(30.585164,36.238414);
    static final LatLng Japan = new LatLng(36.204824,138.252924);
    static final LatLng Kenya = new LatLng(-0.023559,37.906193);
    static final LatLng Kyrgyzstan = new LatLng(41.20438,74.766098);
    static final LatLng Cambodia= new LatLng(12.565679,104.990963);
    static final LatLng Kiribati= new LatLng(-3.370417,-168.734039);
    static final LatLng Comoros= new LatLng(-11.875001,43.872219);
    static final LatLng Saint_Kitts = new LatLng(17.357822,-62.782998);
    static final LatLng North_Korea= new LatLng(40.339852,127.510093);
    static final LatLng South_Korea= new LatLng(35.907757 ,127.766922);
    static final LatLng  Kuwait= new LatLng(29.31166,47.481766);
    static final LatLng Cayman_Islands= new LatLng(19.513469 ,-80.566956);
    static final LatLng Kazakhstan = new LatLng(48.019573,66.923684);
    static final LatLng Laos= new LatLng(19.85627,102.495496);
    static final LatLng  Lebanon= new LatLng(33.854721,35.862285);
    static final LatLng Saint_Lucia= new LatLng(13.909444,-60.978893);
    static final LatLng  Liechtenstein= new LatLng(47.166,9.555373);
    static final LatLng Sri_Lanka= new LatLng(7.873054,80.771797);
    static final LatLng Liberia= new LatLng(6.428055 ,-9.429499);
    static final LatLng Lesotho= new LatLng(-29.609988,28.233608);
    static final LatLng Lithuania= new LatLng(55.169438,23.881275);
    static final LatLng Luxembourg= new LatLng(49.815273,6.129583);
    static final LatLng Latvia= new LatLng(56.879635,24.603189);
    static final LatLng Libya = new LatLng(26.3351,17.228331);
    static final LatLng Morocco= new LatLng(31.791702,-7.09262);
    static final LatLng Monaco= new LatLng(43.750298,7.412841);
    static final LatLng Moldova = new LatLng(47.411631,28.369885);
    static final LatLng Montenegro= new LatLng(42.708678,19.37439);
    static final LatLng Madagascar= new LatLng(-18.766947,46.869107);
    static final LatLng Marshall_Islands= new LatLng(7.131474,171.184478);
    static final LatLng Macedonia= new LatLng(41.608635,21.745275);
    static final LatLng Mali= new LatLng(17.570692,-3.996166);
    static final LatLng Myanmar = new LatLng(21.913965,95.956223);
    static final LatLng Mongolia= new LatLng(46.862496,103.846656);
    static final LatLng Macau= new LatLng(22.198745,113.543873);
    static final LatLng Martinique= new LatLng(14.641528,-61.024174);
    static final LatLng Mauritania= new LatLng(21.00789,-10.940835);
    static final LatLng Montserrat= new LatLng(16.742498,-62.187366);
    static final LatLng Malta= new LatLng(35.937496 ,14.375416);
    static final LatLng Mauritius= new LatLng(-20.348404,57.552152);
    static final LatLng Maldives= new LatLng(3.202778,73.22068);
    static final LatLng Malawi= new LatLng(-13.254308,34.301525);
    static final LatLng Mexico= new LatLng(23.634501,-102.552784);
    static final LatLng Malaysia= new LatLng(4.210484,101.975766);
    static final LatLng Mozambique= new LatLng(-18.665695,35.529562);
    static final LatLng Namibia= new LatLng(-22.95764,18.49041);
    static final LatLng Caledonia= new LatLng(-20.904305,165.618042);
    static final LatLng Norfolk_Island= new LatLng(-29.040835,167.954712);
    static final LatLng Nigeria= new LatLng(9.081999,8.675277);
    static final LatLng Nicaragua = new LatLng(12.865416,-85.207229);
    static final LatLng Netherlands= new LatLng(52.132633,5.291266);
    static final LatLng Norway= new LatLng(60.472024,8.468946);
    static final LatLng Nepal= new LatLng(28.394857,84.124008);
    static final LatLng Nauru = new LatLng(-0.522778,166.931503);
    static final LatLng Niue = new LatLng(-19.054445 ,-169.867233);
    static final LatLng New_Zealand = new LatLng(-40.900557,174.885971);
    static final LatLng Oman= new LatLng(21.512583,55.923255);
    static final LatLng Panama = new LatLng(8.537981 ,-80.782127);
    static final LatLng Peru= new LatLng(-9.189967,-75.015152);
    static final LatLng French_Polynesia= new LatLng(-17.679742 ,-149.406843);
    static final LatLng Papua_New_Guinea= new LatLng(-6.314993,143.95555);
    static final LatLng Philippines= new LatLng(12.879721,121.774017);
    static final LatLng Pakistan= new LatLng(30.375321,69.345116);
    static final LatLng Poland= new LatLng(51.919438,19.145136);
    static final LatLng Puerto_Rico = new LatLng(418.220833 ,-66.590149);
    static final LatLng Portugal= new LatLng(39.399872,-8.224454);
    static final LatLng Palau= new LatLng(7.51498,134.58252);
    static final LatLng Paraguay = new LatLng(-23.442503,-58.443832);
    static final LatLng Qatar= new LatLng(25.354826 ,51.183884);
    static final LatLng Réunion = new LatLng(-21.115141,55.536384);
    static final LatLng Romania = new LatLng(45.943161,24.96676);
    static final LatLng Serbia= new LatLng(44.016521 ,21.005859);
    static final LatLng Russia = new LatLng(61.52401,105.318756);
    static final LatLng Rwanda= new LatLng(-1.940278,29.873888);
    static final LatLng SaudiArabia = new LatLng(23.885942,45.079162);
    static final LatLng Seychelles = new LatLng(-4.679574,55.491977);
    static final LatLng Sweden= new LatLng(60.128161,18.643501);
    static final LatLng Singapore= new LatLng(1.352083,103.819836);
    static final LatLng Slovenia= new LatLng( 46.151241,14.995463);
    static final LatLng Slovakia = new LatLng(48.669026,19.699024);
    static final LatLng SierraLeone = new LatLng(8.460555,-11.779889);
    static final LatLng SanMarino= new LatLng(43.94236,12.457777);
    static final LatLng Senegal = new LatLng(14.497401 ,-14.452362);
    static final LatLng Somalia = new LatLng(5.152149 ,46.199616);
    static final LatLng Suriname = new LatLng(3.919305 ,-56.027783);
    static final LatLng ElSalvador= new LatLng(13.794185,-88.89653);
    static final LatLng Syria= new LatLng(34.802075 ,38.996815);
    static final LatLng Swaziland= new LatLng(-26.522503,31.465866);
    static final LatLng  Chad = new LatLng(15.454166,18.732207);
    static final LatLng Togo = new LatLng(8.619543 ,0.824782);
    static final LatLng Thailand= new LatLng(15.870032,100.992541);
    static final LatLng Tajikistan = new LatLng(38.861034,71.276093);
    static final LatLng Tokelau = new LatLng(-8.967363,-171.855881);
    static final LatLng Timor_Leste= new LatLng(-8.874217,125.727539);
    static final LatLng Turkmenistan = new LatLng(38.969719,59.556278);
    static final LatLng Tunisia= new LatLng(33.886917,9.537499);
    static final LatLng Tonga= new LatLng(-21.178986,-175.198242);
    static final LatLng Turkey= new LatLng(38.963745,35.243322);
    static final LatLng Trinidad = new LatLng(10.691803,-61.222503);
    static final LatLng Tuvalu = new LatLng(-7.109535,177.64933);
    static final LatLng Taiwan= new LatLng(23.69781,120.960515);
    static final LatLng Tanzania = new LatLng(-6.369028,34.888822);
    static final LatLng Ukraine= new LatLng(48.379433,31.16558);
    static final LatLng Uganda = new LatLng(1.373333 ,32.290275);
    static final LatLng UnitedStates= new LatLng(37.09024,-95.712891);
    static final LatLng Uruguay = new LatLng(-32.522779,-55.765835);
    static final LatLng Uzbekistan= new LatLng(41.377491,64.585262);
    static final LatLng Vatican_City= new LatLng(41.902916,12.453389);
    static final LatLng SaintVincent= new LatLng(12.984305 ,-61.287228);
    static final LatLng Venezuela= new LatLng(6.42375,-66.58973);
    static final LatLng Vietnam= new LatLng(14.058324,108.277199);
    static final LatLng Vanuatu= new LatLng(-15.376706 ,166.959158);
    static final LatLng Wallis = new LatLng(-13.768752,-177.156097);
    static final LatLng Samoa= new LatLng(-13.759029 ,-172.104629);
    static final LatLng Kosovo= new LatLng(42.602636 ,20.902977);
    static final LatLng Yemen = new LatLng(15.552727,48.516388);
    static final LatLng Mayotte = new LatLng(-12.8275,45.166244);
    static final LatLng SouthAfrica = new LatLng(-30.559482,22.937506);
    static final LatLng Zambia = new LatLng(-13.133897,27.849332);
    static final LatLng Zimbabwe= new LatLng(-19.015438,29.154857);

    private GoogleMap mMap;
    private LatLng latLng;
    private Marker marker;
    Geocoder geocoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }





    @Override
    public void onMapReady(GoogleMap googleMap){
        mMap=googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        //googleMap.setOnMarkerClickListener((GoogleMap.OnMarkerClickListener) this);
        // Add a marker in Sydney and move the camera
        LatLng sydney=new LatLng(-34,151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(EGYPT));
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            public void onMapClick(LatLng arg0) {
                mMap.addMarker(new MarkerOptions().position(arg0)
                        .title(String.valueOf(arg0.latitude)
                                + ", " + String.valueOf(arg0.longitude)));
            }
        });

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker arg0) {
                arg0.remove();
                Toast.makeText(getApplicationContext()
                        , "Remove Marker " + String.valueOf(arg0.getId())
                        , Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        X = mMap.addMarker(new MarkerOptions()
                .position(EGYPT)
                .title(EGYPT.toString()+"")
                .snippet("temp: " + 2333 +
                        "air:78" + "temp: 25," + "" +
                        "air:" + 66));
    }}

     /*   final LatLng PERTH = new LatLng(-31.90, 115.86);
        X = mMap.addMarker(new MarkerOptions()
                        .position(EGYPT)
                        .title(EGYPT.toString()+"")
                        .snippet("temp: " + 2333 +
                                "air:78" + "temp: 25," + "" +
                                "air:" + 66));


    }*/
     //   }
  /*  public void makershibo(LatLng x) {

        Marker X = mMap.addMarker(new MarkerOptions()
                .position(x)
                .title(x.toString()+"")
                .snippet("temp: " + x  +
                        "air:78" + "temp: 25," + "" +
                        "air:" + x)
       );

    }*/

