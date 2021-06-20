/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/
'use strict';

import axios, { AxiosResponse } from "axios";

export async function callRecommendUrlService(obj: any) {
    // URL to connect for POM recommend
    const URL_BASIC_RECCOMEND: string = "http://192.168.1.105:5000/recommend";

    let alreadyFetched = false;
    let cachedData: void | AxiosResponse<any> | null = null;
    // check if data was fetch already (to avoid same request multiple times)
    // if so, return previous fetched data
    if (alreadyFetched) { return cachedData; }
    // else fetch data

    let data = await axios.post(
        URL_BASIC_RECCOMEND, obj
    ).catch((e) => console.log(e)); // This is optional (use try/catch if you still want)
    // set variables
    alreadyFetched = true;
    cachedData = data;
    return data;
}
/********************************************************************************************************************************
*********************************************************************************************************************************
*                                           START URL RECOMMEND
*********************************************************************************************************************************
*********************************************************************************************************************************/